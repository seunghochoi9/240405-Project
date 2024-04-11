package com.erichgamma.api.article.service;

import com.erichgamma.api.article.model.Article;
import com.erichgamma.api.article.repository.ArticleRepository;
import com.erichgamma.api.article.model.ArticleDto;
import com.erichgamma.api.common.component.MessengerVo;
import com.erichgamma.api.common.component.PageRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository repo;

    @Override
    public MessengerVo save(ArticleDto t) {
        entityToDto(repo.save(dtoToEntity(t)));
        return new MessengerVo();
    }

    @Override
    public MessengerVo deleteById(Long id) {
        repo.deleteById(id);
        return new MessengerVo();
    }

    @Override
    public MessengerVo modify(ArticleDto dto) {
//        repo.findById(dto.getId()).stream().
        return null;
    }

    @Override
    public List<ArticleDto> findAll() {
        return repo.findAll().stream().map(i -> entityToDto(i)).toList();
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
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
