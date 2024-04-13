package com.erichgamma.api.user.service;


import com.erichgamma.api.common.component.MessengerVo;
import com.erichgamma.api.user.model.User;
import com.erichgamma.api.user.model.UserDto;
import com.erichgamma.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public MessengerVo save(UserDto dto) {
        User ent = repository.save(dtoToEntity(dto));
        System.out.println(" ============ UserServiceImpl save instanceof =========== ");
        System.out.println((ent instanceof User) ? "SUCCESS" : "FAILURE");
        return MessengerVo.builder()
                .message((ent instanceof User) ? "SUCCESS" : "FAILURE")
                .build();
    }

    @Override
    public MessengerVo deleteById(Long id) {
        repository.deleteById(id);
        return MessengerVo.builder()
                .message(repository.findById(id).isPresent() ? "SUCCESS" : "FAILURE")
                .build();
    }

    @Override
    public List<UserDto> findAll() {
        return repository.findAll().stream().map(i->entityToDto(i)).toList();
    }
    @Override
    public Optional<UserDto> findById(Long id) {
        return repository.findById(id).map(i -> entityToDto(i));
    }

    @Override
    public MessengerVo count() {
        return MessengerVo.builder()
                .message(repository.count()+"")
                .build();
    }
    @Override
    public Boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public MessengerVo modify(UserDto dto) {
        User ent = repository.save(dtoToEntity(dto));
        System.out.println(" ============ BoardServiceImpl modify instanceof =========== ");
        System.out.println((ent instanceof User) ? "SUCCESS" : "FAILURE");
        return MessengerVo.builder()
                .message((ent instanceof User) ? "SUCCESS" : "FAILURE")
                .build();
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        return repository.findUsersByName(name).stream().map(i->entityToDto(i)).toList();
    }

    @Override
    public List<UserDto> findUsersByJob(String job) {
        return repository.findUsersByJob(job).stream().map(i->entityToDto(i)).toList();
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return repository.findByUsername(username);
    }
    @Override
    public MessengerVo login(UserDto dto) {
        return MessengerVo.builder()
                .message(
                        findUserByUsername(dto.getUsername()).stream()
                                .filter(i -> i.getPassword().equals(dto.getPassword()))
                                .map(i -> "SUCCESS")
                                .findAny()
                                .orElseGet(() -> "FAILURE")
                )
                .build();
    }

}
