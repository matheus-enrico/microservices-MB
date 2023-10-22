package com.ms.email.dtos;

import com.ms.email.models.EmailModel;

import java.util.UUID;

public record EmailDto(UUID userId, String text, String subject, String emailTo) {

    public EmailModel toEntity() {
        return new EmailModel(userId,subject,emailTo, text);
    }

}
