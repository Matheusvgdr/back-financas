package com.projetos.services;

import com.projetos.constants.enums.UserTypeEnum;
import com.projetos.constants.messages.user.UserMessage;
import com.projetos.dto.requests.user.UserRequest;
import com.projetos.dto.responses.ApiResponse;
import com.projetos.dto.responses.user.UserResponse;
import com.projetos.entities.UserModel;
import com.projetos.utils.helper.PasswordHelper;
import com.projetos.utils.mapper.UserMapper;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Set;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserService {

    @Inject
     UserMapper userMapper;

    public ApiResponse<?> saveUser(UserRequest userRequest) {
        try {
            var newUser = userMapper.toUserModel(userRequest);

            newUser.setUserType(UserTypeEnum.NORMAL_USER);
            newUser.setPassword(PasswordHelper.encryptPassword(newUser.getPassword()));

            UserModel.persist(newUser);

            return new ApiResponse<>(null, UserMessage.USER_CREATED, HttpResponseStatus.CREATED.code());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ApiResponse<Set<UserResponse>> getUsers() {

        PanacheQuery<UserModel> usersQuery = UserModel.findAll();

        Set<UserResponse> formattedUsers = usersQuery.stream()
                .map(user -> userMapper.toUserResponse(user))
                .collect(Collectors.toSet());

        return new ApiResponse<>(formattedUsers, UserMessage.USERS_FIND, HttpResponseStatus.OK.code());
    }
}
