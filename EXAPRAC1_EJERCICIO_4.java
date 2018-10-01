/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac1_ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author loque
 */
public class EXAPRAC1_EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hola Usuario, este programa te ayudara a calcular la altura maxima y distancia de un objeto lanzado, desde un angulo de 45 grados");
        
        
        System.out.println("Ingresa la velocidad inicial del objeto");
        double vel_0;
        vel_0 = input.nextDouble();
        
        double alt_m;
        alt_m = ((vel_0 * vel_0) * (0.85090352453 * 0.85090352453)) / 2 * (9.81);
        
        double dist;
        dist = ((vel_0 * vel_0) * (2 * 0.85090352453)) / 9.81;
        
        System.out.println("Tu altura maxima es de " +alt_m +" m");
        System.out.println("Tu distancia es de " +dist +" m");
        
        
    }
    
}
