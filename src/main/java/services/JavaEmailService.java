/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
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
