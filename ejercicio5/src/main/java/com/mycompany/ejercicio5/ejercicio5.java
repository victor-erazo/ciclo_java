/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

DESCRIPCION DEL EJERCICIO
Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.




 */
package com.mycompany.ejercicio5;
import java.util.*;  
import java.util.Scanner;
/**
 *
 * @author vler
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ============ RECOLECCION DE DATOS:
        var alum = new Scanner(System.in);
        System.out.println("nombre del alumno: ");
        var alumno = alum.next();
        
        var no1 = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nota 1: ");
        var nota1 = no1.nextFloat();
        //var nota1 = no1.nextInt();
        
        var no2 = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nota 2: ");
        var nota2 = no2.nextFloat();
        //var nota2 = no2.nextInt();
        
        var no3 = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nota 3: ");
        var nota3 = no3.nextFloat();
        //var nota3 = no3.nextInt();
        var resultado="";
        //resultado = estudiantes(alumno, nota1, nota2, nota3);
        resultado = estudiantes(alumno, nota1, nota2, nota3);
        System.out.println("El estudiante "+alumno+" ha "+resultado);
        
        
    }
    // DEFINIR CLASE ESTUDIANTE CON DATOS
    //public static String estudiantes(String alumno, int nota1, int nota2, int nota3) {
    public static String estudiantes(String alumno, float nota1, float nota2, float nota3) {
        var promedio = 0.0; //0.0;
        var salida = "";
        promedio = (nota1+nota2+nota3)/3;
        //String aprobado = "aprobado";
        //String reprobado = "reprobado";
        
        if (promedio >=3.0){
            //salida=
                    //System.out.println("Aprobado");
            //return "Aprobado";
            //return aprobado;
            salida = "aprobado";
        } 
        else {
            //salida=
            //System.out.println("Reprobado");
            //return "REprobado";
            //return reprobado;
            salida = "reprobado";
        } 
                
        return salida;
    }
    
}
