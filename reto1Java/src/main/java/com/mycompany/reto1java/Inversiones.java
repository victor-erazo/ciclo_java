/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto1java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vler
 */
public class Inversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        var datos = new Scanner(System.in);
        System.out.println("Variable Tiempo: ");
        int vTiempo = datos.nextInt();
        
        var datos2 = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Monto Inversion: ");
        double vMonto = datos2.nextDouble();
        
        var datos3 = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Interes: ");
        double vInteres = datos3.nextDouble();
        
        ///*
        //var salida="";
        var resul = validarInversion(vTiempo, vMonto, vInteres);
        System.out.println(resul);
        //*/
    }
    
    // Definicion de Metodos
    // SIN STATIC NO FUNCIONA LA SALIDA
    public static double generarInteresSimple(int vTiempo, double vMonto, double vInteres){
        var interesSimple= vMonto*vInteres*vTiempo;
        System.out.println("Simple: "+interesSimple);
        return interesSimple;
    }
    
    public static double generarInteresCompuesto(int vTiempo, double vMonto, double vInteres){
        //var interesCompuesto= vMonto * [(1+vInteres)**vTiempo - 1];
        var potencia = Math.pow((1+vInteres),vTiempo);
        var interesCompuesto= vMonto * (potencia - 1);
        System.out.println("Compuesto: "+interesCompuesto);
        return interesCompuesto;
    }
    ///*
    public static String validarInversion (int vTiempo, double vMonto, double vInteres) {
       //var respuesta = 0;
    //Cálculo de la diferencia entre tipos de tasas
        //var respuesta = generarInteresCompuesto( ) - generarInteresSimple( );
       var compu = generarInteresCompuesto(vTiempo, vMonto, vInteres );
       var simple = generarInteresSimple( vTiempo, vMonto, vInteres);       
       var respuesta = compu - simple; 
        //var respuesta_beta = (generarInteresCompuesto(vTiempo, vMonto, vInteres )) - (generarInteresSimple( vTiempo, vMonto, vInteres));
        //var respuesta = respuesta_beta*(-1);
        System.out.println("respuesta: "+respuesta);
        if (respuesta!=0){
            return "La diferencia en el total de intereses generados para el proyecto," +
                    " si escogemos entre evaluarlo a una tasa de interés Compuesto y" +
                    " evaluarlo a una tasa de interés Simple, asciende a la cifra de: $"+respuesta;
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses "
                    + "generados para el proyecto.";
        }
    } 
    //*/
    
}
