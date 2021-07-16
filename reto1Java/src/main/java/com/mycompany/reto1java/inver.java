/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto1java;

import java.util.Scanner;

/**
 *
 * @author vler
 */
public class inver {
    // Recoleccion de datos // Atributos basicos
    
        var datos = new Scanner(System.in);
        System.out.println("Variable Tiempo: ");
        int vTiempo = datos.nextInt();
        
        var datos2 = new Scanner(System.in);
        System.out.println("Monto Inversion: ");
        double vMonto = datos2.nextDouble();
        
        System.out.println("Interes: ");
        double vInteres = datos2.nextDouble();
        
       
    // Definicion de Metodos
    
    public double generarInteresCompuesto(int vTiempo, double vMonto, double vInteres){
        var interesSimple= vMonto*vInteres*vTiempo;
        return interesSimple;
    }
    
    public double generarInteresSimple(int vTiempo, double vMonto, double vInteres){
        //var interesCompuesto= vMonto * [(1+vInteres)**vTiempo - 1];
        var potencia = Math.pow((1+vInteres),vTiempo);
        var interesCompuesto= vMonto * (potencia - 1);
        return interesCompuesto;
    }
    
    
    public String validarInversion (int vTiempo, double vMonto, double vInteres) {
    
    /* Cálculo de la diferencia entre tipos de tasas */
    var respuesta = generarInteresCompuesto( ) - generarInteresSimple( );
        if (respuesta){
            return "La diferencia en el total de intereses generados para el proyecto,\n" +
                    "si escogemos entre evaluarlo a una tasa de interés Compuesto y\n" +
                    "evaluarlo a una tasa de interés Simple, asciende a la cifra de: $";
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses "
                    + "generados para el proyecto.";
        }
    } 
}
