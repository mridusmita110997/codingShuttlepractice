package com.codingShuttle.mrid.module1.impl;

import com.codingShuttle.mrid.module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("smsNotif")// added qualifier
//Even if primary but the qualifier passed in constructor takes precendence
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message){
        System.out.println("SmsNotificationService"+message);
    }
}
