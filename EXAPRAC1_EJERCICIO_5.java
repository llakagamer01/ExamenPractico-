/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac1_ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author FRONTIER
 */
public class EXAPRAC1_EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Hola usuario");
        
        System.out.println("Incerte velocidad inicial angular");
        double vai;
        
        vai = input.nextDouble();
        System.out.println("Incerte velocidad angular final");
        double vaf;
        
        vaf = input.nextDouble();
        System.out.println("Inserte tiempo");
        double tim;
        
        tim = input.nextDouble();
        System.out.println("Inserte radio de la rueda en metros");
        int rad;
        
        rad = input.nextInt();
        double desang;
        
        desang = (vaf - vai) * tim;
        double dismet;
        
        dismet = (double) 2 * 3.1416 * rad / tim;
        double velangpro;
        
        velangpro = vai * vaf / 2;
        double velmetpro;
        
        velmetpro = (vai * rad - vaf * rad) / tim;
        double aceang;
        aceang = vai * vaf / tim;
        
        double acepromet;
        acepromet = (vaf * rad - vai * rad) / tim;
        
        double frec;
        frec = (double) 2 * 3.1416 / (vaf - vai);
        
        System.out.println("La distancia angular es...");
        System.out.println(desang +" °");
        
        System.out.println("La distancia en metros es...");
        System.out.println(dismet +" m");
        
        System.out.println("La velocidad angular promedio es ...");
        System.out.println(velangpro +" rad/s");
        
        System.out.println("La velocidad promedio en metros es... ");
        System.out.println(velmetpro +" m/s");
        
        System.out.println("La aceleracion angular es...");
        System.out.println(aceang +" s-²");
        
        System.out.println("La aceleracion en metros es...");
        System.out.println(acepromet +" m/s");
        
        System.out.println("La frecuencia es...");
        System.out.println(frec +" rad/s");
    }
}

    
    

