/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.exceptions;

/**
 *
 * @author Fabricio
 */
public class EmailException extends Exception{
    
    public EmailException(){
    super("Ha occurido un error al enviar el correo");
    }
    
    public EmailException(String mensaje){
    super(mensaje);
    }
    
}
