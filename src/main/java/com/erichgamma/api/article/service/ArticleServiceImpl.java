package com.erichgamma.api.article;

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
    public ArticleDto save(ArticleDto t) {
        return entityToDto(Optional.of(repo.save(dtoToEntity(t))));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<ArticleDto> findAll(PageRequestVo vo) {
//        return repo.findAll(vo);
        return null;
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
        return Optional.of(entityToDto(repo.findById(id)));
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
