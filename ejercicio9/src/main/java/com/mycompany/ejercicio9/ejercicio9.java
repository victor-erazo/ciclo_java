/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

EJERCICIO 6 - TALLER SEMANA 1
Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110




 */
package com.mycompany.ejercicio9;
//import java.util.*;  
import java.util.Scanner;

/**
 *
 * @author vler
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var datoSexo = new Scanner(System.in);
        System.out.println("Sexo (H/M): ");
        var sexo = datoSexo.next();
        
        var datoAltura = new Scanner(System.in);
        System.out.println("Altura (Cm): ");
        var Alto = datoAltura.nextInt();
        
        
        
        
        if(sexo == "H"){
            var pesoHombre = Alto - 110;
            System.out.println("Tu peso ideal: "+pesoHombre);
        }
        else {
            var pesoMujer = Alto - 120;
            System.out.println("Tu peso ideal: "+pesoMujer);
        }
        
        
        
    }
    
}
