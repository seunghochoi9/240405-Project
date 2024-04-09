package com.erichgamma.api.article.service;

import com.erichgamma.api.article.model.Article;
import com.erichgamma.api.article.repository.ArticleRepository;
import com.erichgamma.api.article.model.ArticleDto;
import com.erichgamma.api.common.component.MessengerVo;
import com.erichgamma.api.common.component.PageRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
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
    public MessengerVo modify(ArticleDto boardDto) {
        return null;
    }

    @Override
    public List<ArticleDto> findAll() {
        return repo.findAll().stream().map(i -> entityToDto(i)).toList();
    }

    @Override
    public Optional<ArticleDto>  findById(Long id) {
//        Optional.of(entityToDto(repo.findById(id)));
        return Optional.empty();
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
