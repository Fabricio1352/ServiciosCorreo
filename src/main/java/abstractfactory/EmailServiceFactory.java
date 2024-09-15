/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import services.EmailService;
import services.JavaEmailService;

/**
 *
 * @author Fabricio
 */
public class EmailServiceFactory {
    // Como se pueden manejar distintos servicios para crear los correos, aqui se crean los servicios, en este caso, solo es java mail service
    
    public static EmailService createEmailService(String type, String host, String user, String password){
        if("javamail".equalsIgnoreCase(type)){ // el usuario quiere usar el servicio javamail, entonces regresa ese servicio
        return new JavaEmailService(host,user,password);
        }
        
        throw new IllegalArgumentException("Unknown Email Service Type");
    }
}
