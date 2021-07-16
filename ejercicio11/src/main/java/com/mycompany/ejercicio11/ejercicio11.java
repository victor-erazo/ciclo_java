/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

EJERCICIO 8 - TALLER SEMANA 1
Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar.



 */
package com.mycompany.ejercicio11;
import java.util.*;
import java.util.Scanner;
import java.util.Hashtable;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 *
 * @author vler
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var sc = new Scanner(System.in);
        System.out.println("Jugador 1 : ");
        var nombre1 = sc.next();
        //var plt1 = new Scanner(System.in);
        System.out.println("Ingrese P (Piedra), T (Tijera), L(Papel) : ");
        var plt1 = sc.next();
        //var sc1 = new Scanner(System.in);
        System.out.println("Jugador 2 : ");
        var nombre2 = sc.next();
        //var plt2 = new Scanner(System.in);
        System.out.println("Ingrese P (Piedra), T (Tijera), L(Papel) : ");
        var plt2 = sc.next();

        int ganador=2;
        //var ganador = sc.nextInt();

        if ((plt1.equalsIgnoreCase("P")) && (plt2.equalsIgnoreCase("T"))){
            ganador = 1;
        } else if ((plt1.equalsIgnoreCase("T")) && (plt2.equalsIgnoreCase("L"))){
            ganador = 1;
        } else if ((plt1.equalsIgnoreCase("L")) && (plt2.equalsIgnoreCase("P"))){
            ganador=1;
        } else if (plt1.equalsIgnoreCase(plt2)){
            ganador=0;
        }

        switch (ganador) {
            case 1:
                System.out.println("Gana Jugador 1");
                break;
            case 2:
                System.out.println("Gana Jugador 2");
                break;
            default:
                System.out.println("empate");
        }
        
        /*
        var no = new Scanner(System.in);
        System.out.println("Numero de jugadores: ");
        var numero = no.nextInt();
        
        for (int i = 1; i<=numero; i++){
            
            var jug = new Scanner(System.in);
            System.out.println("Nombre Jugador: ");
            var jugador = jug.next();
            //var ele = new Scanner(System.in);
            System.out.println("Dime Piedra - Papel o Tijera: ");
            var elemento = jug.next();
            
            // De esta forma creo mi diccionario en java
            Hashtable<String, String> personasyDato = new Hashtable<String, String>();

            // De esta forma asocio a una persona con su dato en el diccionario
            personasyDato.put(jugador, elemento);
        */
        
        }
    
        /*
        // De esta forma podemos recorrer la lista de personas junto a sus edades
        for (Map.Entry<String, String> entry : personasyDato.entrySet()) {
          System.out.println(entry.getKey() + " tiene " + entry.getValue());
        }
        
        Enumeration llaves = personasyDato.keys();
        while (llaves.hasMoreElements()) {
          System.out.println(""+"hashtable llaves: " + llaves.nextElement());
        */
        
}
