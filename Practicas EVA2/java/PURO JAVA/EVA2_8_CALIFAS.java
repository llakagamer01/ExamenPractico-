/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_califas;

import java.util.Scanner;

/**
 *
 * @author loque
 */
public class EVA2_8_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la letra de tu calificacion");
        
        String iday = input.nextLine();
        switch(iday) {
                
            case "A":
                System.out.println("10");
                break;
            case "B":
                System.out.println("9");
                break;
            case "C":
                System.out.println("8");
                break;
            case "D":
                System.out.println("7");
                break;
            case "E":
                System.out.println("6");
                break;
            case "F":
                System.out.println("Reprobado");
                break;
            
            default: System.out.println("dale las nalgas al profe");
    }
    }
}
