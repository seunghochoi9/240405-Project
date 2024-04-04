package com.example.demo.article;

import com.example.demo.board.Board;
import com.example.demo.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity(name="articles")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
public class Article extends BaseEntity {
    @Id
    @Column(name ="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private Long writer;


    @ManyToOne
    @JoinColumn(name = "board_id", nullable = true)
    private Board board;
}