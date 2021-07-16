/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author vler
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Seccion Ejemplo para saludo a persona
        var nombre = "leo";
        var resultado = saludo(nombre);
        System.out.println(resultado);
        
    }
    public static String saludo(String nombre) {
        return "hola "+nombre+"!";
    }
    
}
