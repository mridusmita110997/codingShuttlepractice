package com.codingShuttle.mrid.module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PaymentService {
    int a = 0;
    private static final Logger log = LoggerFactory.getLogger(PaymentService.class);
    public PaymentService(){
        log.info("PaymentService const is called");
    }

    public PaymentService(int a){
        log.info("PaymentService const is called a is : {}" , a);
    }

    public void pay(){
        log.info("pay is called");
    }

    @PostConstruct
    public void afterInitaaa(){
        System.out.println("Before paying..");
    }

    @PreDestroy
    public void beforeDestry(){
        System.out.println("after paying..");
    }
}

