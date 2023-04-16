/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.util.Date;
import java.util.Properties;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Stateless
@LocalBean
public class EmailSessionBean {
    
    private final int port = 465;
private final String host = "smtp.gmail.com";
private final String from = "matket3009@gmail.com";
private final boolean auth = true;
private final String username = "matket3009@gmail.com";
private final String password = "ketmat3009";
private final Protocol protocol = Protocol.SMTPS;
private final boolean debug = true;

    public void sendEmail(String to,String subject ,String body)
    {
        
        Properties props = new Properties();
props.put("mail.smtp.host", host);
props.put("mail.smtp.port", port);
switch (protocol) {
case SMTPS:
props.put("mail.smtp.ssl.enable", true);
break;
case TLS:
props.put("mail.smtp.starttls.enable", true);
break;
}
     


Authenticator authenticator = null;
if (auth) {
props.put("mail.smtp.auth", true);
authenticator = new Authenticator() {
private final PasswordAuthentication pa;
    {
        this.pa = new PasswordAuthentication(username, password);
    }
@Override
public PasswordAuthentication getPasswordAuthentication() {
return pa;
}
};
}

Session session = Session.getInstance(props, authenticator);
session.setDebug(debug);


MimeMessage message = new MimeMessage(session);
try {
message.setFrom(new InternetAddress(from));
InternetAddress[] address = {new InternetAddress(to)};
message.setRecipients(Message.RecipientType.TO, address);
message.setSubject(subject);
message.setSentDate(new Date());
message.setText(body);
Transport.send(message);
} catch (MessagingException ex) {
ex.printStackTrace();
}
    }
}
