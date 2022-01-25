package com.Sample.Mail;

import com.Sample.Mail.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@SpringBootApplication
public class MailApplication {
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(MailApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail()
	{
		senderService.sendEmail("rahulraja2699@gmail.com","Welcome User","Welcome");
	}

}
