/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iess;

//import ec.gob.iess.operaciones.basicas.Operaciones;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Jose
 */
@LocalBean
@Stateless

public class OperacionesBasicasNegocio  {
    
    public double llamarOperacion(final String operacion, final  int a, final int b){
        switch (operacion){
            case "suma":
                return Operaciones.suma(a, b);
            case "resta":
                return Operaciones.resta(a, b);
            case "multiplicacion":
                return Operaciones.multiplicacion(a, b);
            case "division":
                return Operaciones.diviion(a, b);
           default: return -1;
        }
    }
}
