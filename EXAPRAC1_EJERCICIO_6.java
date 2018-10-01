/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac1_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author loque
 */
public class EXAPRAC1_EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);           
        System.out.println("Para saber la pendiente, area entre esos dos ,de y=x*x");
        double rY1, rY2, rX1, rX2, rPend, rArea, rXR, rXR2;
        
        System.out.println("Para conocer la pendeinte y su area deme los siguientes datos porfavor");
        System.out.println("Dame el numero de X");
        rXR = input.nextDouble();
        
        System.out.println("Dame Y1");
        rY1 = input.nextDouble();
        
        System.out.println("Dame Y2");
        rY2 = input.nextDouble();
        
        System.out.println("Dame X1");
        rX1 = input.nextDouble();
        
        System.out.println("Dame X2");
        rX2 = input.nextDouble();
        
        rPend = (rY2 - rY1) / (rX2 - rX1);
        rArea = (rY2 - rY1) * (rX2 - rX1);
        rXR2 = rXR * rXR;
        
        System.out.print("La respuesta de la ecuacion es:");
        System.out.println(rXR2);
        System.out.print("La pendiente de la ecuacion es:");
        System.out.println(rPend);
        System.out.print("El area de la ecuacion es:");
        System.out.println(rArea);        
    }
    
}
