package com.erichgamma.api.article.service;

import com.erichgamma.api.article.model.Article;
import com.erichgamma.api.article.model.ArticleDto;
import com.erichgamma.api.common.service.CommandService;
import com.erichgamma.api.common.service.QueryService;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto> {

    default Article dtoToEntity(ArticleDto dto) {
        return Article.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
    }

    default ArticleDto entityToDto(Article entity){
        return ArticleDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writer(entity.getWriter().getUsername())
                .build();
    }
}
