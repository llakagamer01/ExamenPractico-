
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivanpiñon peña 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
        System.out.println("Dame un numero del 1 al 12");
        int iFecha;
        
        iFecha = input.nextInt();
        if (iFecha == 12) 
            System.out.println("Es diciembre");
         else 
        if (iFecha == 11) 
        System.out.println("es noviembre");
         else 
        if (iFecha == 10) 
        System.out.println("es octrubre");
        else 
        if (iFecha == 9) 
        System.out.println("es septiembre");
        else 
        if (iFecha == 8) 
        System.out.println("es agosto");
         else 
        if (iFecha == 7) 
        System.out.println("es julio");
         else 
        if (iFecha == 6) 
        System.out.println(" es junio");
         else 
        if (iFecha == 5) 
        System.out.println("es mayo");
         else 
        if (iFecha == 4) 
        System.out.println("es abril");
        else 
        if (iFecha == 3) 
        System.out.println("es marzo");
         else 
        if (iFecha == 2) 
        System.out.println("es febrero");
         else 
        if (iFecha == 1) 
        System.out.println("es enero");
         else 
        System.out.println("Me diste un numero fuera de lo indicado >:v");
                                                    
                                                
                                      
                                 
    
    }
    
}
