/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

DESCRIPCION DEL EJERCICIO:
Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.





 */
package com.mycompany.ejercicio4;
import java.util.Scanner;
/**
 *
 * @author vler
 * ========================================= EJERCICIO 1 DEL TALLER SEMANAL.......!!!!
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ============ RECOLECCION DE DATOS:
        var no1 = new Scanner(System.in);
        System.out.println("Numero 1: ");
        var numero1 = no1.nextInt();
        
        var no2 = new Scanner(System.in);
        System.out.println("Numero 2: ");
        var numero2 = no2.nextInt();
       
        /* 
        var ope = new Scanner(System.in);
        System.out.println("Selecciona Operacion tigre\n 1: suma\n 2: resta\n 3: multiplicacion ");
        int operacion = ope.nextInt();
        
        switch (operacion){
            case 1:
                var calculo = numero1 + numero2;
                System.out.println("suma: "+calculo);
                break;
            
            case 2:
                var calculo = numero1 - numero2;
                System.out.println("resta: "+calculo);
                break;
            
            case 3:
               var calculo = numero1 * numero2;
               System.out.println("multiplicacion: "+calculo);
               break;
            
            default:
                System.out.println("ESCOGE BIEN VE!!!");
        }
        
        */
        // =================#####################################################################
        var ope = new Scanner(System.in);
        System.out.println("operacion en minusculas tigre: ");
        var operacion = ope.next();
        
        
        // Seccion de conexion con funcion
        var resultado = operaciones(operacion, numero1, numero2);
        System.out.println("La "+operacion+" de "+numero1+" y "+numero2+" es igual a "+resultado);
         //=================################################################################## */
        
    }
    // =================#####################################################################
    public static int operaciones(String  operacion, int numero1, int numero2) {
        var calculo=0;
        
        // DEFINICION DE OPERACIONES
        switch (operacion){
            case "suma":
                calculo= numero1 + numero2;
                //return calculo;
                break;
            
                 
            
        }
        return calculo;
          
    }
    //=================################################################################## */
}
