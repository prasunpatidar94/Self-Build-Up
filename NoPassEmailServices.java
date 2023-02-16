package com.pp.sun.commands;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class MyCommandLine implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        String to = "prasunpatidar94@gmail.com";            // sender email
        String from = "sunpatidar94@gmail.com";       // receiver email
        String host = "172.20.10.1";                   // mail server host

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);
        // default session


        MimeMessage message = new MimeMessage(session);
        // email message

        message.setFrom(new InternetAddress(from));
        // setting header fields


        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("Test Mail from Java Program"); // subject line

        // actual mail body
        message.setText("You can send mail from Java program");

        System.out.println("workig");


        message.setText("You can send mail from Java program by using mail API, but you need");

        // Send message
        Transport.send(message);
        System.out.println("Email Sent successfully....");


    }
}

