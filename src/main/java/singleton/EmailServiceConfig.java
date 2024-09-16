package singleton;
import java.util.HashMap;
import java.util.Map;

import services.EmailService;


/*
 * 
 * Patron Singleton para manejar las configuraciones (EmailServiceConfig) y garantizar que los envios de correos siempre se mantengan con la configuracion mas reciente
 * En otras palabras, que los cambios se apliquen sin reiniciar el componente
 * 
 * Fabricio
 */
public class EmailServiceConfig {

    // Instancia de la clase para asegurar que solo exista una clase global
    private static EmailServiceConfig instance;
    private Map<String, EmailService> services =new HashMap<>();

    // Constructor privado para que no se creen nuevas instancias externas, asi evitamos cualquier conflicto de versiones o cambios
    private EmailServiceConfig(){}

    // Retornar la unica instancia de la clase
    public static synchronized EmailServiceConfig getInstance(){
        if(instance == null){
            instance = new EmailServiceConfig();
        }
        return instance;
    }



    // Agregamos un servicio de correo con su configuracion
    public void addService(String name, EmailService service){
        services.put(name, service);
    }


    // Obtener un servicio de correo por su nombre
    public EmailService getService(String name){
        return services.get(name);
    }


}
