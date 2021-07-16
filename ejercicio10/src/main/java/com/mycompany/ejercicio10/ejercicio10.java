/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

EJERCICIO 7 - TALLER SEMANA 1
Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar

 */
package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author vler
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var dato = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        var numero = dato.nextInt();
        
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            System.out.println("Numero NO primo");
        }
        
        for (int i=2; i<numero/2; i++){
            // Si es divisible por cualquiera de estos números, no
            // es primo
            
            if (numero % i == 0){
                System.out.println("Numero NO primo");
                break;
            }
            
            else {
                // Si no se pudo dividir por ninguno de los de arriba, sí es primo
                System.out.println("Numero primo");
                break;
            }    
            
    }
    
}
}