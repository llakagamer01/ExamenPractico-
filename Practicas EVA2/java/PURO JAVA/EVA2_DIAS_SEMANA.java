/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_dias_semana;

import java.util.Scanner;

/**
 *
 * @author loque
 */
public class EVA2_DIAS_SEMANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
  System.out.println("Ingresa numero de dias");
  int numero = 0;
  while ( numero >7 || numero<1){
   numero = input.nextInt(); 
  
  switch(numero){
    case 1:
     System.out.println("lunes");
     break;
    case 2:
     System.out.println("martes");
     break;
    case 3:
     System.out.println("miercoles");
     break;
    case 4:
     System.out.println("jueves");
     break;
    case 5:
     System.out.println("viernes");
     break;
    case 6:
     System.out.println("sabado");
     break;
    case 7:
     System.out.println("domingo");
     break;
    default:
     System.out.println("ingreso otro numer0");
     break;
  }
    }
    }
}
