package org.example;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class App {
    public static void main( String[] args ) throws MessagingException {
        String stringEmail = "dedmoroz.khimki@gmail.com";
        String sender = "igor0111847@gmail.com";
        String host = "localhost";
        String username = "Igor Sc";
        String password = "";
        Properties props = System.getProperties();
        props.setProperty("mail.smtp.host", host);
        props.put("mail.smtp.port", 457);
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(sender));
        message.addRecipients(Message.RecipientType.TO,
                String.valueOf(new InternetAddress(stringEmail)));
        message.setSubject("Send Java");
        message.setText("Java says hello from Igor");
        Transport.send(message);
        System.out.println("Send complete");
    }
}
