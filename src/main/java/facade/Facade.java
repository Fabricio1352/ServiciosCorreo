package facade;
import services.EmailService;
import singleton.EmailServiceConfig;

public class Facade {

    private EmailServiceConfig config;

    public Facade(){
        this.config = EmailServiceConfig.getInstance();
    }

    public void sendEmail(String serviceName, String to, String subject, String body) throws Exception {
        EmailService service = config.getService(serviceName);
        if(service!=null){
            service.sendEmail(to, subject, body);
        }else{
            throw new IllegalArgumentException("Service not found: " + serviceName);
        }
    }

}
