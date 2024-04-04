package com.example.demo.article;

import com.example.demo.common.command.CommandService;
import com.example.demo.common.query.QueryService;

import java.util.Optional;


public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto> {

    default Article dtoTOEntity(ArticleDto dto) {

        Article article = Article.builder()
                .content(dto.getContent())
                .build();

        return article;
    }

    default Optional<ArticleDto> entityToDto(Article ent) {
        ArticleDto dto = ArticleDto.builder()

                .content(ent.getContent())
                .build();

        return Optional.of(dto);

    }
}
