package com.erichgamma.api.board.service;

import com.erichgamma.api.board.model.BoardDto;
import com.erichgamma.api.board.repository.BoardRepository;
import com.erichgamma.api.common.component.MessengerVo;
import com.erichgamma.api.common.component.PageRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    
    private final BoardRepository repo;

    @Override
    public MessengerVo save(BoardDto t) {
        entityToDto(repo.save(dtoToEntity(t)));
        return new MessengerVo();
    }

    @Override
    public MessengerVo deleteById(Long id) {
        repo.deleteById(id);
        return new MessengerVo();
    }

    @Override
    public MessengerVo modify(BoardDto boardDto) {
        return null;
    }

    @Override
    public List<BoardDto> findAll() {
        return repo.findAll().stream().map(i-> entityToDto(i)).toList();
    }

    @Override
    public Optional<BoardDto> findById(Long id) {
        return repo.findById(id).map(i -> entityToDto(i));
    }

    @Override
    public Long count() {
        return repo.count();
    }

    @Override
    public Boolean existsById(Long id) {
        return repo.existsById(id);
    }
}
