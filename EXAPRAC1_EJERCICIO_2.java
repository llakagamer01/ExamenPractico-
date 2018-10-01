/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac1_ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author FRONTIER
 */
public class EXAPRAC1_EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hola Usuario");
        System.out.println("Este programa te ayudara a saber el caudal de una tuberia");
        
        System.out.println("Ingresa la velocidad del fluido");
        double vel_1;
        vel_1 = input.nextDouble();
        
        System.out.println("Ingresa el radio de la tuberia");
        double rd_1;
        rd_1 = input.nextDouble();
        
        double Su_1;
        Su_1 = 3.14159265359 * (rd_1 * rd_1);
        
        double Qau_1;
        Qau_1 = vel_1 * Su_1;
        
        System.out.println("Tu caudal es de " +Qau_1 +" m³/s");
    }
    
}
