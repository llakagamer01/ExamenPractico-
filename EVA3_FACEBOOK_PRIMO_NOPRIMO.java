
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, x=1, c=0;
        Scanner input = new Scanner (System.in);
        System.out.println("Ingresa un numero");
        numero = input.nextInt();
        while (x <= numero){
            if(numero % x == 0){
                c++;
            }
            x++;
        }
        if(c==2) { 
            System.out.println("Es Primo");
        } else { 
            System.out.println("No es Primo");
        }
               
    }
    
}
