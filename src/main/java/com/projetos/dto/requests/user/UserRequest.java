package com.projetos.dto.requests.user;

import jakarta.validation.constraints.NotBlank;

public record UserRequest(
        @NotBlank(message = "Name is required.") String name,
        @NotBlank(message = "Username is required.") String username,
        @NotBlank(message = "Password is required.") String password,
        @NotBlank(message = "Email is required.") String email

) {
}
