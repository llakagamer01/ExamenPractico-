/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_break_continue;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_15_BREAK_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //for: no manipulamos la variable del contador
        for (int i = 1; i <= 10; i++) {
            int iResi = i % 5;
            if(iResi == 0)
                continue;
            System.out.println(i);//INTERRUPTOR DE LA LOGICA DEL PROGRAMA
            
            
            }
            
        }
        //CONTINUE 
        //IMPRIMIR TODOS LOS NUMEROS QUE NO SEAN
        //DIVISIBLES ENTRE 5
        
    }
    

