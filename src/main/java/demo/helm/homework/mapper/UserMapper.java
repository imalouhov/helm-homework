package demo.helm.homework.mapper;

import demo.helm.homework.dto.UserDto;
import demo.helm.homework.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto map(UserEntity entity);

    UserEntity map(UserDto dto);

    List<UserDto> mapList(List<UserEntity> all);

    Optional<UserDto> map(Optional<UserEntity> optional);
}
