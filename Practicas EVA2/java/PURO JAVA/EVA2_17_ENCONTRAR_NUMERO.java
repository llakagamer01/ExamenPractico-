/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_encontrar_numero;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_16_ENCONTRAR_NUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //0 -- > 1
        //NUMEROS ENTRE 1 Y 10
        int inom = (int)(Math.random() * 10) +1;
        //System.out.println("Numero =" + inom);
        for (int i = 0; i < 3; i++) {
            System.out.println("Adivina el numero");
            int inum = input.nextInt();
            if(inum == inom){
                System.out.println("Felicidades Ganaste");
                break;
            }
            if(i == 2){
                System.out.println("Perdiste");
            }
        }
    }
    
}
