package demo.helm.homework.service;

import demo.helm.homework.dto.UserDto;
import demo.helm.homework.entity.UserEntity;
import demo.helm.homework.mapper.UserMapper;
import demo.helm.homework.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UserService {

    UserRepository userRepository;
    UserMapper userMapper;

    public List<UserDto> getAll() {
        return userMapper.mapList(userRepository.findAll());
    }

    public UserDto addUser(UserDto dto) {
        return userMapper.map(userRepository.save(userMapper.map(dto)));
    }

    public Optional<UserDto> getById(UUID id) {
        Optional<UserEntity> optional = userRepository.findById(id);
        return optional.map(userMapper::map);
    }
}
