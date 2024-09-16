/*
 * JavaEmailService.java
 * 
 * Clase creada el 15 de Septiembre de 2024
 * 
 */
package services;

/**
 *
 * Servicio que pidio el cliente JavaMail. En este caso, manda utilizando la api de java. 
 * Esta es solo una integracion de un servicio. La aplicacion puede implementar mas servicios
 * 
 * @author Fabricio
 */
public class JavaEmailService implements EmailService {

    private String host, user, password;

    public JavaEmailService(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;

    }

    @Override
    public void sendEmail(String to, String subject, String body) throws Exception {

        // Java Mail implementacion
    }

}
