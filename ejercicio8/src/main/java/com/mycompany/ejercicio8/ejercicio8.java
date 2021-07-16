/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

EJERCICIO 5 - TALLER SEMANA 1
Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio.

 */
package com.mycompany.ejercicio8;
//import java.util.*;  
import java.util.Scanner;


/**
 *
 * @author vler
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var numAleatorio = Math.round(Math.random()*100+1);
        System.out.println("Numero Aleatorio: "+numAleatorio);
        
        var numero = 0;
        
        while (numAleatorio != numero) {
            
            var num = new Scanner(System.in);
            System.out.println("di un numero y adivina: ");
            numero = num.nextInt();
            
            if (numAleatorio>numero) {
                System.out.println("El numero que buscas es MAYOR ");
                
            }
            else if (numAleatorio<numero) {
                System.out.println("El numero que buscas es MENOR ");
                
            }
            else {
                System.out.println("ADIVINASTES...!!!! ");
                break;
            }
        }
        
    }
    
}
