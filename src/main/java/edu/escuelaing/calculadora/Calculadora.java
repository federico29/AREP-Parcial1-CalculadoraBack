/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.calculadora;

/**
 *
 * @author Federico Barrios Meneses
 */
public class Calculadora {
    
    public Calculadora(){
    }
    
    public static Double calcular(String operacion, Double valor){
        Double resultado = 0.0; 
        if(operacion.equals("sin")){
            resultado = Math.sin(valor);
        }
        if(operacion.equals("tan")){
            resultado = Math.tan(valor);
        }
        if(operacion.equals("cos")){
            resultado = Math.cos(valor);
        }
        return resultado;
    }
}
