/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_for_medias;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_FOR_MEDIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int iMedia = 0;
        for (int iEdad = 0; iEdad < 5; iEdad++) 
        {System.out.println("Ingresa tu edad");
            iMedia += input.nextInt();
        
    }
        System.out.println("La media es de " +  ((double)iMedia / 5) );
}
}