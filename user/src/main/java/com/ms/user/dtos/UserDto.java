package com.ms.user.dtos;

import com.ms.user.models.UserModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserDto(@NotBlank String name, @NotBlank @Email String email) {

    public UserModel toEntity() {
        return new UserModel(name, email);
    }

}