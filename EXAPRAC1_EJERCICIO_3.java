/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac1_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author FRONTIER
 */
public class EXAPRAC1_EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Hola Usuario");
        System.out.println("Este programa te ayudara a saber tu intensidad de corriente, tu resistencia total y cuanta corriente hay en cada resistencia");
        
        System.out.println("Ingresa la resistencia 1");
        double r1;
        r1 = input.nextDouble();
        
        System.out.println("Ingresa la resistencia 2");
        double r2;
        r2 = input.nextDouble();
        
        System.out.println("Ingresa la resistencia 3");
        double r3;
        r3 = input.nextDouble();
        
        System.out.println("Ingresa la resistencia 4");
        double r4;
        r4 = input.nextDouble();
        
        System.out.println("Ingresa la resistencia 5");
        double r5;
        r5 = input.nextDouble();
        
        System.out.println("Ingresa el Voltaje del circuito");
        double VDP;
        VDP = input.nextDouble();
        
        double RT;
        RT = 1 / ((1 / r1) + (1 / r2) + (1 / r3) + (1 / r4) + (1 / r5));
        
        double InC;
        InC = VDP / RT;
        
        System.out.println("Ingresa la resistencia donde quieras saber cuanta corriente pasa por esa resistencia");
        double IN1;
        IN1 = VDP / r1;
        
        double IN2;
        IN2 = VDP / r2;
        
        double IN3;
        IN3 = VDP / r3;
        
        double IN4;
        IN4 = VDP / r4;
        
        double IN5;
        IN5 = VDP / r5;
        
        System.out.println("Tu resistencia total es de " + RT + " Ω");
        System.out.println("Tu intensidad de corriente es de " +InC + " A");
        System.out.println("Tu intensidad de corriente que pasa la resistencia 1 es de " +IN1 +" A");
        System.out.println("Tu intensidad de corriente que pasa la resistencia 2 es de " +IN2 +" A");
        System.out.println("Tu intensidad de corriente que pasa la resistencia 3 es de " +IN3 +" A");
        System.out.println("Tu intensidad de corriente que pasa la resistencia 4 es de " +IN4 +" A");
        System.out.println("Tu intensidad de corriente que pasa la resistencia 5 es de " +IN5 +" A");
    }
    
}

