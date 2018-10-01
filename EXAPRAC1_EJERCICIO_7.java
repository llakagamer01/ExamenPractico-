/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac1_ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author loque
 */
public class EXAPRAC1_EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
       System.out.println("Para sacar la canonica de una hiperbola necesito varios datos");
        double rX, rX2, rY, rY2, rA, rA2, rB, rB2, rCanon;
        
        System.out.println("Dame X");
        rX2 = input.nextDouble();
        rX = rX2 * rX2;
        
        System.out.println("Dame Y");
        rY2 = input.nextDouble();
        rY = rY2 * rY2;
        
        System.out.println("Dame a");
        rA2 = input.nextDouble();
        rA = rA2 * rA2;
        
        System.out.println("Dame b");
        rB2 = input.nextDouble();
        rB = rB2 * rB2;
        
        rCanon = rX / rA - rY / rB;
        System.out.print("La distancia de centro al foco es:");
        System.out.println(rCanon);
        System.out.print("Las cordenadas de los vertices son:");
        System.out.print("(");
        System.out.print(rX2);
        System.out.print(",");
        System.out.print(rY2);
        System.out.println(")");
        System.out.print("Las cordenadas de los focos son:");
        System.out.print("(");
        System.out.print(rA2);
        System.out.print(",");
        System.out.print(rB2);
        System.out.println(")");
    }
    
}
