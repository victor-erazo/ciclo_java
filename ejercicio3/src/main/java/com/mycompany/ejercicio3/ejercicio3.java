/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;
import java.util.Scanner;

/**
 *
 * @author vler
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Seccion Ejemplo para calculo de cifras
        var sc = new Scanner(System.in);
        
        System.out.println("INTRODUCE UN NUMERO ENTERO: ");
        var numero = sc.nextInt();
        
        // Seccion de conexion con funcion
        var digitos = numeroDigitos(numero);
        System.out.println("El numero tiene"+digitos+" cifras");
    }
    
    public static int numeroDigitos(int numero) {
        var cifras=0;
        
        // Ojo con el orden al decir diferente de cero
        while (numero != 0){
            numero /= 10;
            cifras++;
        }
        return cifras;
    }
    
}
