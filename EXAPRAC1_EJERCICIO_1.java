/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac1_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author FRONTIER
 */
public class EXAPRAC1_EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hola Usuario");
        
        System.out.println("Ingresa tu temperatura en grados Fahrenheit");
        double Fare;
        Fare = input.nextDouble();
        
        double Centi;
        Centi =(Fare - 32) /  1.8;
        
        double Kelv;
        Kelv = (5 * (Fare - 32) / 9) + 273.15;
        
        System.out.println("Su temperatura en Celcius es de " +Centi +" °C");
        System.out.println("Su temperatura en Kelvin es de " +Kelv +" °K");
        
                
        
        
    }
    
}
