/*
 * JavaEmailService.java
 * 
 * Clase creada el 15 de Septiembre de 2024
 * 
 */
package services;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import services.exceptions.EmailException;

/**
 *
 * Servicio que pidio el cliente JavaMail. En este caso, manda utilizando la api
 * de java. Esta es solo una integracion de un servicio. La aplicacion puede
 * implementar mas servicios
 *
 * @author Fabricio
 */
public class JavaMailService implements EmailService {

    private String user, password;

    public JavaMailService(String user, String password) {
        this.user = user;
        this.password = password;

    }
// offc tsbe heko bcbz

    /*
    * Metodo para enviar un email con el uso de Java Mail API, en este caso, como no tengo servidor SMTP, usaremos el de Gmail
    * Por lo que los correos seran mandados a cuentas de gmail
     */
    @Override
    public void sendEmail(String to, String subject, String body) throws EmailException {
        try {
            
            System.out.println("Preparing Email...");
            Properties properties = new Properties();

            // Establecemos las propiedas para enviar el correo por gmail
            properties.put("mail.smtp.host", "smtp.gmail.com"); // uso del servidor SMTP de gmail
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com"); // activamos el ssl
            properties.put("mail.smtp.starttls.enable", "true"); // configuraciones de tls relacionadas con el ssl, creo
            properties.put("mail.smtp.port", "587"); // puerto que utiliza gmail
            properties.setProperty("mail.smtp.user", user); // usuario que envia
            properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2"); 
            properties.put("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(properties); // instancia de una sesion, parte de la jerarquia de java mail, se configura en base a las propiedades

            MimeMessage correo = new MimeMessage(session);
            correo.setFrom(new InternetAddress(user));
            correo.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            correo.setSubject(subject);
            correo.setText(body, "ISO-8859-1", "html");

            Transport transport = session.getTransport("smtp");
            transport.connect(user, "offc tsbe heko bcbz");
            transport.sendMessage(correo, correo.getRecipients(Message.RecipientType.TO));
            transport.close();
            System.out.println("enviado");
        } catch (AddressException ex) {
            System.out.println(ex.getMessage() + " Esto ha sido a causa de una direccion incorrecta");
            Logger.getLogger(JavaMailService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            System.out.println(ex.getMessage() + " Esto ha sido a causa de un mensaje incorrecto");
            Logger.getLogger(JavaMailService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        return "JavaMailAPI";
    }

    


}
