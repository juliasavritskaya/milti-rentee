package com.mnkqn.accommodationservice.model.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailNotificationDto {

    @NotBlank(message = "Not blank")
    @Email(message = "Wrong email format")
    private String emailAddress;

    @NotBlank(message = "{notification.subject.blank.message}")
    private String emailSubject;

    @NotBlank(message = "{notification.content.blank.message}")
    private String emailContent;

    public EmailNotificationDto(String userEmail, String subject, String content) {
        this.emailAddress = userEmail;
        this.emailSubject = subject;
        this.emailContent = content;
    }
}