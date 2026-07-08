package com.codingShuttle.mrid.module1.impl;

import com.codingShuttle.mrid.module1.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Bean made as primary
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message){
        System.out.println("SmsNotificationService"+message);
    }
}
