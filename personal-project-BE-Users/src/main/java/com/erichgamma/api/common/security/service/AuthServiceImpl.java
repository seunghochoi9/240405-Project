package com.erichgamma.api.common.security.service;

import com.erichgamma.api.common.component.JwtProvider;
import com.erichgamma.api.common.component.MessengerVo;
import com.erichgamma.api.user.model.UserDto;
import com.erichgamma.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@Service
@Log4j2
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository repo;
    private final JwtProvider jwt;

    @Override
    public MessengerVo login(UserDto dto) {
        boolean flag = repo.findUserByUsername(
                dto.getUsername()).get().getPassword().equals(dto.getPassword());
        return MessengerVo.builder()
                .message(flag ? "SUCCESS" : "FAILURE")
                .token(flag ? jwt.createToken(dto) : "Noe")
                .build();
    }

}
