package com.example.demo.user;

import java.util.*;

import com.example.demo.common.component.MessengerVo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RequiredArgsConstructor
@RequestMapping(path = "/api/users")
@Slf4j
public class UserController {
    private final UserRepository repo;
    private final UserServiceImpl userservice;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @PostMapping(path = "")
    public ResponseEntity<MessengerVo> save(@RequestBody Map<String, UserDto> param) {
        log.info("입력받은 정보: {}", param);
        return ResponseEntity.ok(new MessengerVo());
    }


    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @PostMapping("/api/users/login")
    public ResponseEntity<MessengerVo> longin(@RequestBody Map<?, ?> paramap) {
        Map<String, MessengerVo> map = new HashMap<>();
        // User optUser = repo.findByUsername((String) paramap.get("username")).orElse(null);
        //Long id = optUser.getId();
        String password = (String) paramap.get("password");
        String username = (String) paramap.get("username");

        return ResponseEntity.ok(new MessengerVo());
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/{id}")
    public ResponseEntity<List<UserDto>> findAll(Pageable pageable) {

        return ResponseEntity.ok(new ArrayList<UserDto>());
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserDto>> findbyid(@PathVariable Long id) {
        Map<String, String> response = new HashMap<>();

        return ResponseEntity.ok(Optional.of(new UserDto()));
    }


//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
//            @ApiResponse(responseCode = "404", description = "Customer not found")})
//    @PostMapping(path = "/api/users/join")
//    public Map<String, ?> join(@RequestBody Map<?, ?> paramap) {
//        log.info("입력받은 정보: {}", paramap);
//
//        User newUser = repo.save(User.builder().
//                username((String) paramap.get("username")).
//                password((String) paramap.get("password")).
//                name((String) paramap.get("name")).
//                phone((String) paramap.get("phone")).
//                job((String) paramap.get("job")).
//
//                build());
//        System.out.println("DB 에 저장된 user 정보:" + newUser);
//        Map<String, MessengerVo> map = new HashMap<>();
//        return map;
//    }
}
