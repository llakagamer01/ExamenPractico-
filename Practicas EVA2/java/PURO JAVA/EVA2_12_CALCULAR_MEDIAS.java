/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_calcular_medias;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_CALCULAR_MEDIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int iSumaE = 0;
        System.out.println("Edad 1");
        iSumaE += input.nextInt();
        System.out.println("Edad 2");
        iSumaE += input.nextInt();
        System.out.println("Edad 3");
        iSumaE += input.nextInt();
        System.out.println("Edad 4");
        iSumaE += input.nextInt();
        System.out.println("Edad 5");
        
        iSumaE += input.nextInt();
        
        
        System.out.println("La media es de " +  ((double)iSumaE / 5) );
    }
        
        
    }
    

