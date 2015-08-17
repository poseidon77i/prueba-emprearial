/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iess;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Jose
 */
@Named(value = "saludoControlador")  // para verla desde vistas
@ViewScoped
public class HolaMundoControlador implements Serializable{
    private static final long serialVersionUID = -9175632231507284323L;  //identificador unico de la clase
    
    @EJB
    private NewSessionBean hola;
    
    private String holaMundo;
    
    @PostConstruct
    public void cargarVariable(){
        setHolaMundo(hola.devolverHolaMundo());
    }



    public String getHolaMundo() {
        return holaMundo;
    }

    public void setHolaMundo(String holaMundo) {
        this.holaMundo = holaMundo;
    }

  
    
    
    
    
}
