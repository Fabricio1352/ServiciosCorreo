/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author Fabricio
 */
public class ServicePop3 implements EmailService{

    @Override
    public void sendEmail(String to, String subject, String body) throws Exception {

        System.out.println("El servicio POP3 esta enviando un email...");
        System.out.println("Email enviado por este servicio!");
    }

    @Override
    public String toString() {
        return "Servicio POP3";
    }
    
    
  
}
