package com.projetos.utils.mapper;

import com.projetos.dto.requests.user.UserRequest;
import com.projetos.dto.responses.user.UserResponse;
import com.projetos.entities.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface UserMapper {
    UserModel toUserModel(UserRequest userRequest);
    UserResponse toUserResponse(UserModel userModel);
}
