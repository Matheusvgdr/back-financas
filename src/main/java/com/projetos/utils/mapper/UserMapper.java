package com.projetos.utils.mapper;

import com.projetos.dto.requests.user.UserRequest;
import com.projetos.dto.responses.user.UserResponse;
import com.projetos.entities.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserModel toUserModel(UserRequest userRequest);
    UserResponse toUserResponse(UserModel userModel);
}
