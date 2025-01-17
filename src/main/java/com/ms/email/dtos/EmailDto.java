package com.ms.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto { //validação

    @NotBlank
    private String ownerRef;

    @NotBlank
    @Email
    private String emailFrom;

    @NotBlank
    @Email
    private String emailTo;

    @NotBlank
    private String subject;

    @NotBlank
    private String text;
}
