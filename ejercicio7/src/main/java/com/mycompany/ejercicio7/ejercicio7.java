/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

EJERCICIO 4 DEL TALLER DE LA SEMANA
Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.

 */
package com.mycompany.ejercicio7;
//import java.util.*;  
import java.util.Scanner;

/**
 *
 * @author vler
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var num = new Scanner(System.in);
        System.out.println("di un numero: ");
        var numero = num.nextInt();
        
        var resultado = 0;
        
        for (int i=0;i<=10;i++){
            resultado = numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);
        } 
    
    
    }
    
}
