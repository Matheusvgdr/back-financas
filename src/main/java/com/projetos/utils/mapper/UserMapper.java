package com.projetos.utils.mapper;

import com.projetos.dto.requests.user.UserRequest;
import com.projetos.dto.responses.user.UserResponse;
import com.projetos.entities.UserModel;
import com.projetos.entities.logs.UserLogModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface UserMapper {

    UserModel toUserModel(UserRequest userRequest);
    UserResponse toUserResponse(UserModel userModel);

    @Mapping(source = "id", target = "idUser")
    UserLogModel toUserLogModel(UserModel userModel);
}
