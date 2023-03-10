package com.mnkqn.accommodationservice.service;

import com.mnkqn.accommodationservice.model.dto.EmailNotificationDto;
import com.mnkqn.accommodationservice.model.dto.EmailNotificationEvent;

public interface EmailNotificationService {

    void sendEmail(EmailNotificationDto email);

    void notifyUser(EmailNotificationEvent event, String email, String content);

    void notifyUser(String event, String email);
}
