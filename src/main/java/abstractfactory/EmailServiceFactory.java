/*
 * EmailServiceFactory.java
 * 
 * Clase creada el 15 de Septiembre de 2024
 */
package abstractfactory;

import services.EmailService;
import services.*;

/**
 *
 * Aqui crearemos las instancias de los distintos servicios de correo electronico. En este caso, el cliente solo solicito javamail
 * 
 * @author Fabricio
 */
public class EmailServiceFactory {
    // Como se pueden manejar distintos servicios para crear los correos, aqui se crean los servicios, en este caso, solo es java mail service el que funciona o tiene logica implementada
    
    public static EmailService createEmailService(String type, String host, String user, String password){
        if("javamail".equalsIgnoreCase(type)){ // el usuario quiere usar el servicio javamail, entonces regresa ese servicio
        return new JavaMailService(user,password);
        }
        else if("pop3".equalsIgnoreCase(type)){
        return new ServicePop3(); //simulamos que tenemos mas servicios
        }
        else if("imap".equalsIgnoreCase(type)){
        return new ServicioIMAP();//simulamos que tenemos mas servicios
        }
        throw new IllegalArgumentException("Unknown Email Service Type");
    }
}
