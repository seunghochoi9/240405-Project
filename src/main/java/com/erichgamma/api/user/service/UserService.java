package com.erichgamma.api.user;

import com.erichgamma.api.common.service.CommandService;
import com.erichgamma.api.common.service.QueryService;

import java.util.Optional;

public interface UserService extends CommandService<UserDto>, QueryService<UserDto> {
    default User dtoToEntity(UserDto dto) {
        return User.builder().build();
    }
    default UserDto entityToDto(Optional<User> optional){
        return UserDto.builder().build();
    }
}
