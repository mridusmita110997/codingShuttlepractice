package com.codingShuttle.mrid.module1.impl;

import com.codingShuttle.mrid.module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailNotif")// added qualifier
@ConditionalOnProperty(name = "notification.type" , havingValue = "email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("EmailNotificationService " + message);
    }
}
