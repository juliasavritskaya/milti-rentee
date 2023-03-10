package com.mnkqn.accommodationservice.model.dto;

public enum EmailNotificationEvent {
    APPLY_FOR_ACCOMMODATION("applied");

    public final String message;

    EmailNotificationEvent(String message) {
        this.message = message;
    }
}
