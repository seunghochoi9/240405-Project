package com.erichgamma.api.board;
import com.erichgamma.api.article.model.Article;
import com.erichgamma.api.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = {"id"})
@Entity(name = "boards")
public class Board extends BaseEntity {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String boardName;
    private String boardType;

    @OneToMany(mappedBy = "board",fetch = FetchType.LAZY)
    private List<Article> articles;
}
