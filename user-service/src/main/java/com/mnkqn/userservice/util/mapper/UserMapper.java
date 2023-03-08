package com.mnkqn.userservice.util.mapper;

import com.mnkqn.userservice.domain.dto.UserDto;
import com.mnkqn.userservice.domain.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User fromUserDtoToUserEntity(UserDto userDto);

}
