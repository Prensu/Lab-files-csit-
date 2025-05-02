// JavaMail APi is used to send and receive Emails in java.

// use cases 
// .Sending Emails from an applilcation (eg;Passowrd reset, welcome email , otp, etc)
// attaching files to the email (eg; pdf, images, etc)

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.*;

public class SendEmail {
    public static void main(String[] args) {

        // Your email and app password
        final String username = "your_email@gmail.com";
        final String password = "your_app_password";

        // SMTP server configuration
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create session
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Compose the message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("recipient@example.com"));
            message.setSubject("Hello from JavaMail!");
            message.setText("This is a test email sent from Java.");

            // Send the message
            Transport.send(message);
            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
