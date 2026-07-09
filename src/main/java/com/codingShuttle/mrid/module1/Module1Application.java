package com.codingShuttle.mrid.module1;

import com.codingShuttle.mrid.module1.impl.EmailNotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

//	@Autowired Removed and done constructor injection
	NotificationService notificationService; //field dependency injection we should avoid this

	public Module1Application (@Qualifier("emailNotif") NotificationService notificationService){
		this.notificationService =  notificationService ; // qualifier added to override the primary
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//Singlton bean e.g.
//		System.out.println(paymentService.hashCode());
//		System.out.println(paymentService2.hashCode());
//
//		paymentService.pay();
//		paymentService2.pay();
		// wrong since notification srvcs a interface
//		NotificationService notificationService = new NotificationService();

//		NotificationService notificationService = new EmailNotificationService();
		//
		notificationService.send("Hello"); // output sms notif as its primary if used without qualifier
//O.P the primary bean will be picked
	}
}
