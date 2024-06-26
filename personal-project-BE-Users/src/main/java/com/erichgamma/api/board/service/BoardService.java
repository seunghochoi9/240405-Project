package com.erichgamma.api.board.service;

import com.erichgamma.api.board.model.Board;
import com.erichgamma.api.board.model.BoardDto;
import com.erichgamma.api.common.service.CommandService;
import com.erichgamma.api.common.service.QueryService;

import java.util.Optional;


public interface BoardService extends CommandService<BoardDto>, QueryService<BoardDto> {
    default Board dtoToEntity(BoardDto dto) {
        return Board.builder()
                .id(dto.getId())
                .boardType(dto.getBoardType())
                .build();
    }

    default BoardDto entityToDto(Board entity){
        return BoardDto.builder()
                .id(entity.getId())
                .boardType(entity.getBoardType())
                .build();
    }
    
}
