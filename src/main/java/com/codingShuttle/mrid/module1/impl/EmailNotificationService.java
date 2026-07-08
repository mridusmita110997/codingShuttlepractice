package com.codingShuttle.mrid.module1.impl;

import com.codingShuttle.mrid.module1.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("EmailNotificationService " + message);
    }
}
