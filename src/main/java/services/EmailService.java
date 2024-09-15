/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

/**
 *
 * @author Fabricio
 */
public interface EmailService {
    void sendEmail(String to, String subject, String body) throws Exception; //cambiar a una exc personalizada
}
