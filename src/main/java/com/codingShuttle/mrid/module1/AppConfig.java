package com.codingShuttle.mrid.module1;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.beans.BeanProperty;

@Configurable
public class AppConfig {

    @Bean
    @Scope("prototype")
    public PaymentService paymentService(){
        return new PaymentService(2);
    }
}
