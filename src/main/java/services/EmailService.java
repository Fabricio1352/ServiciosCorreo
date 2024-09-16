/*
 * EmailService.java
 * 
 * Clase creada el 15 de Septiembre de 2024
 * 
 */
package services;

/**
 * Esta clase representa el comportamiento base que debe de tener cualquier servicio de email que el cliente quiera implementar
 * 
 * @author Fabricio
 */
public interface EmailService {
    void sendEmail(String to, String subject, String body) throws Exception; //cambiar a una exc personalizada
}
