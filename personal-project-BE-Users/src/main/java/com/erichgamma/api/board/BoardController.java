package com.erichgamma.api.board;

import com.erichgamma.api.board.model.BoardDto;
import com.erichgamma.api.board.repository.BoardRepository;
import com.erichgamma.api.board.service.BoardService;
import com.erichgamma.api.board.service.BoardServiceImpl;
import com.erichgamma.api.common.component.MessengerVo;
import com.erichgamma.api.common.component.PageRequestVo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/boards")
public class BoardController {
    private final BoardService service;
    @PostMapping("/save")
    public ResponseEntity<MessengerVo> save(@RequestBody BoardDto dto){
        return ResponseEntity.ok(service.save(dto));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<MessengerVo> deleteById(@RequestParam Long id){
        return ResponseEntity.ok(service.deleteById(id));
    }
    @GetMapping("/list")
    public ResponseEntity<List<BoardDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/detail")
    public ResponseEntity<Optional<BoardDto>> findById(@RequestParam Long id){
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping("/count")
    public ResponseEntity<Long> count(){
        return ResponseEntity.ok(service.count());
    }
    @GetMapping("/exists/{id}")
    public ResponseEntity<MessengerVo> existsById(PageRequestVo vo){
        service.existsById(null);
        return ResponseEntity.ok(new MessengerVo());
    }

}
