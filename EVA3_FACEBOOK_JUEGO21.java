/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_facebook_juego21;

import java.util.Scanner;

/**
 *
 * @author loque
 */
public class EVA3_FACEBOOK_JUEGO21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         int usu = 0;
        int ipc = 0;
        
        String resu;
        
        System.out.println("Quieres sacar una carta?");
            resu = input.nextLine();
            
        while(resu.toLowerCase().equals("YES")){
            int num = (int)(Math.random() * 14) + 1;
            int nom = (int)(Math.random() * 14) + 1;
            System.out.println("Computador = " + nom);
            System.out.println("Tú = " + num);
                usu += num;
                ipc += nom;
            System.out.println("Quieres sacar una carta?");
                resu = input.nextLine();

        }
        System.out.println("Computador = " + ipc);
        System.out.println("Tú = " +  usu);
        
        if((usu == 21) && (ipc < 21) && (usu > ipc)){
            System.out.println("Ganaste");
        }else if(usu == ipc){
            System.out.println("Empate");
        }else if ((ipc == 21) && (usu < 21) && (ipc > usu))
            System.out.println("Perdiste");
    }
    
}
