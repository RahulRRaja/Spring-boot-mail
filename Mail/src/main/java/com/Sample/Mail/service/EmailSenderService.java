package com.Sample.Mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail,
                          String Subject,String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rahulrajaspringboot@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(Subject);

        mailSender.send(message);

        System.out.println("Message Sent Successfully .....");
    }
}
