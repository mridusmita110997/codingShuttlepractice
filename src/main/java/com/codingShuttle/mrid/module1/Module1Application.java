package com.codingShuttle.mrid.module1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Module1Application implements CommandLineRunner{

	@Autowired
	PaymentService paymentService;

	@Autowired
	PaymentService paymentService2;

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(paymentService.hashCode());
		System.out.println(paymentService2.hashCode());

		paymentService.pay();
		paymentService2.pay();

	}
}
