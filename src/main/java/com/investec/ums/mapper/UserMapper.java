package com.investec.ums.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.investec.ums.dto.UserDTO;
import com.investec.ums.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

	UserDTO mapToUserDto(User user);

	User mapToUser(UserDTO userDto);
}