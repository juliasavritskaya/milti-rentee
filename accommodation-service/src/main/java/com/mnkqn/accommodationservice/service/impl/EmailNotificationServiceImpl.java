package com.mnkqn.accommodationservice.service.impl;

import com.mnkqn.accommodationservice.model.dto.EmailNotificationDto;
import com.mnkqn.accommodationservice.model.dto.EmailNotificationEvent;
import com.mnkqn.accommodationservice.service.EmailNotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
@Slf4j
@PropertySource("classpath:messages.properties")
public class EmailNotificationServiceImpl implements EmailNotificationService {

    private final Environment environment;
    private final JavaMailSender emailSender;

    public EmailNotificationServiceImpl(Environment environment, JavaMailSender emailSender) {
        this.environment = environment;
        this.emailSender = emailSender;
    }

    @Async
    @Override
    public void sendEmail(EmailNotificationDto email) {
        log.info("Send email to {}.", email.getEmailAddress());
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email.getEmailAddress());
        message.setSubject(email.getEmailSubject());
        message.setText(email.getEmailContent());
        emailSender.send(message);
        log.info("The email has been successfully sent.");
    }

    @Override
    public void notifyUser(EmailNotificationEvent event, String email, String content) {
        String contentMessage =
                environment.getProperty("message.user." + event.message + ".content");
        EmailNotificationDto notificationDto =
                new EmailNotificationDto(
                        email,
                        environment.getProperty(
                                "message.user." + event.message + ".subject", content),
                        MessageFormat.format(contentMessage, content));
        sendEmail(notificationDto);
    }

    @Override
    public void notifyUser(String event, String email) {
        EmailNotificationDto notificationDto =
                new EmailNotificationDto(
                        email,
                        environment.getProperty("message.user." + event + ".subject"),
                        environment.getProperty("message.user." + event + ".content"));
        sendEmail(notificationDto);
    }
}