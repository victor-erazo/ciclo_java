/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.

 */
package com.mycompany.ejercicio6;
import java.util.*;  
import java.util.Scanner;
/**
 *
 * @author vler
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ============ RECOLECCION DE DATOS:
        var emple = new Scanner(System.in);
        System.out.println("nombre del empleado: ");
        var empleado = emple.next();
        
        var hh = new Scanner(System.in);
        System.out.println("horas laboradas: ");
        var horas = hh.nextInt();
        
        var costoHora=30000;
        
        var sueldo = costoHora*horas;
        System.out.println("Valor de sueldo del empleado "+empleado+" es "+sueldo);
        
        
        
        
        
    }
    
}
