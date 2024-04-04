package com.example.demo.user;


import com.example.demo.common.command.CommandService;
import com.example.demo.common.query.QueryService;

import java.util.List;

public interface UserService extends CommandService, QueryService {
    String updatePassword(User user);
    //query
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);

}
