package facade;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.EmailService;
import singleton.EmailServiceConfig;


/**
 * 
 * Clase con la que el cliente va interactuar para crear los emails
 * El cliente no sabe lo que esta haciendo el metodo, el solo manda a llamar al metodo sendEmail  y se despreocupa de la logica de mandar ese email
 * 
 * @author Fabricio
 */
public class Facade {

    private EmailServiceConfig config;

    public Facade(){
        this.config = EmailServiceConfig.getInstance();
    }

    /**
     * Metodo para mandar un email. Todos los servicios deben compartir los mismos atributos
     * @param serviceName nombre del servicio a utilizar
     * @param to destinatario
     * @param subject subject del email
     * @param body cuerpo del mensaje
     */
    public void sendEmail(String serviceName, String to, String subject, String body) {
        
        // EmailService es la interfaz que da el comportamiento base a todos los servicios implementados
        // EmailServiceConfig es una instancia unica para estar cambiando dinamicamente la configuracion elegida por el usuario
        EmailService service = config.getService(serviceName); // la configuracion trata de obtener un servicio
        if(service!=null){
            try {
                service.sendEmail(to, subject, body); // delegamos la responsabilidad de la logica de mandar el email al servicio seleccionado
            } catch (Exception ex) {
                Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            throw new IllegalArgumentException("Service not found: " + serviceName); // si el servicio no existe...
        }
    }
    


}
