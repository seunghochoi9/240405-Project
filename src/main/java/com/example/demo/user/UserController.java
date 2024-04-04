package com.example.demo.user;

import java.sql.SQLException;
import java.util.*;


import com.example.demo.common.component.MessengerVo;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repo;
    private final UserServiceImpl userservice;
    @SuppressWarnings("unchecked")
    @GetMapping("/api/all-users")
    public List<?>findAll()  {
//        System.out.println("java 실행");
//        Map<String,Object> map = new HashMap<>();
//        List<User> list = new ArrayList<>();
//        list = userservice.findAll();
//        list.forEach(System.out::println);
//        System.out.println("리스트 사이즈: "+ list.size());
//        map.put("result",list);
//        System.out.println("자바 실행 마무리");
        List<User> map = new ArrayList<>();
        List<User> ls = repo.findAll();
        return repo.findAll();
    }

    @PostMapping("/api/users/login")
    public Map<String, ?> longin(@RequestBody Map<?, ?> paramap) {
        Map<String, MessengerVo> map = new HashMap<>();
        User optUser = repo.findByUsername((String) paramap.get("username")).orElse(null);
        Long id = optUser.getId();
        String password = (String) paramap.get("password");
        String username = (String) paramap.get("username");


        System.out.println("ID is " + optUser);
        return map;
    }
    @PostMapping(path = "/api/users/join")
    public Map<String, ?> join(@RequestBody Map<?, ?> paramap) {

        String strHeight = String.valueOf(paramap.get("height"));
        String strWeight = String.valueOf(paramap.get("weight"));
        User newUser = repo.save(User.builder().
                username((String) paramap.get("username")).
                password((String) paramap.get("password")).
                name((String) paramap.get("name")).
                phone((String) paramap.get("phone")).
                job((String) paramap.get("job")).

                build());
        System.out.println("DB 에 저장된 user 정보:" + newUser);
        Map<String, MessengerVo> map = new HashMap<>();
        return map;
    }
}
