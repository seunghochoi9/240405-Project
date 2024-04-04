package com.example.demo.board;

import com.example.demo.article.Article;
import com.example.demo.article.ArticleDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BoardService {
    default Map<String, ?> dtoTOEntity(BoardDto dto){
        Map<String, Article> map = new HashMap<>();

        List<BoardDto> boardDtoList = new ArrayList<>();
        // boardId로 DB를 조회해서 해당 게시판에 게시된 글의 목록을 가져올 경우

        return map;
    }
    default BoardDto entityToDto(){

        BoardDto dto =BoardDto.builder().build();

        return dto;
    }
    
}
