/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iess;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Jose
 */


@Named
@ViewScoped
public class OperacionesBasicasControlador implements Serializable{
    private static final long serialVersionUID = -3453114597920595110L;

   

    
    @EJB
    private OperacionesBasicasNegocio operacionBasicaNegocio ;
    
    private Double resultadoOperacion;
    private Integer num1=1;
    private Integer num2=2;


    /**
     * @return the num1
     */
    public Integer getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public Integer getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

   

    /**
     * @return the resultadoOperacion
     */
    public Double getResultadoOperacion() {
        return resultadoOperacion;
    }

    /**
     * @param resultadoOperacion the resultadoOperacion to set
     */
    public void setResultadoOperacion(Double resultadoOperacion) {
        this.resultadoOperacion = resultadoOperacion;
    }
    
    public void realizaOperacion(final String operacion) {        
        resultadoOperacion = operacionBasicaNegocio.llamarOperacion(operacion, num1, num2);
    }
}
