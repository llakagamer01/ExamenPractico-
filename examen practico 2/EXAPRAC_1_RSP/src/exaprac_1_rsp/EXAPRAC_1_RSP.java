/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac_1_rsp;

import java.util.Scanner;

/**
 *
 * @author loque
 */
public class EXAPRAC_1_RSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Juego piedra-papel-tijera");
      
 
      
      System.out.println("La computadora ya escogio...");
 
      System.out.println("Indica el numero de objeto a jugar");
      System.out.println("Piedra= 1");
      System.out.println("Papel= 2");
      System.out.println("Tijera= 3");
      int select = input.nextInt();
      int empt = 0;
      int win = 0;
      int cpuwin = 0;
      
      
              if(select < 4);
              else
              System.out.println("Numero invalido");
      do{
          System.out.print("El CPU eligio : ");
          int CPU = (int)(Math.random() * 3) + 1;
      switch (CPU)
      {
         case 1:
            System.out.println("Piedra");
            switch (select)
            {
               case 1: System.out.println("Empate"); 
               empt = empt + 1;
               System.out.println("Has empatado: " + empt + " veces");
               break;
               case 2: System.out.println("Ganaste");
               win = win + 1;
               System.out.println("Has ganado: " + win + " veces");
               break;
               case 3: System.out.println("CPU Gana"); 
               cpuwin = cpuwin + 1;
               System.out.println("CPU ha ganado: " + cpuwin + " veces");
               break;
            }
            break;
 
         case 2:
            System.out.println("Papel");
            switch (select)
            {
               case 1: System.out.println("CPU Gana");
               cpuwin = cpuwin + 1;
               System.out.println("CPU ha ganado: " + cpuwin + " veces");
               break;
               case 2: System.out.println("Empate"); 
               empt = empt + 1;
               System.out.println("Has empatado: " + empt + " veces");
               break;
               case 3: System.out.println("Ganaste"); 
               win = win + 1;
               System.out.println("Has ganado: " + win + " veces");
               break;
            }
            break;
 
         case 3:
            System.out.println("Tijera");
            switch (select)
            {
               case 1: System.out.println("Ganaste"); 
               win = win + 1;
               System.out.println("Has ganado: " + win + " veces");
               break;
               case 2: System.out.println("CPU Gana"); 
               cpuwin = cpuwin + 1;
               System.out.println("CPU ha ganado: " + cpuwin + " veces");
               break;
               case 3: System.out.println("Empate"); 
               empt = empt + 1;
               System.out.println("Has empatado: " + empt + " veces");
               break;
            }
            break;
                
            }
            System.out.println("Elige otro valor si quieres seguir jugando");
        select = input.nextInt();
    }while(select < 4);
      
      
      
      
      
    
}
    }
