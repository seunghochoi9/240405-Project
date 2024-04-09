package com.erichgamma.api.board;

import com.erichgamma.api.article.model.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@Log4j2
@Builder
public class BoardDto {

    private Long id;
    private String boardName;
    private String boardType;
    private List<Article> articles;
}
