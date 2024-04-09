package com.erichgamma.api.board;

import com.erichgamma.api.common.command.CommandService;
import com.erichgamma.api.common.query.QueryService;

import java.util.Optional;


public interface BoardService extends CommandService<BoardDto>, QueryService<BoardDto> {
    default Board dtoToEntity(BoardDto dto) {
        return Board.builder().build();
    }

    default BoardDto entityToDto(Optional<Board> optional){
        return BoardDto.builder().build();
    }
    
}
