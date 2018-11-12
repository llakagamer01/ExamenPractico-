/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_acumuladores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_ACUMULADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //ACUMULADOR
        
        //SUMA
        int iSuma = 0; 
        System.out.println("Valor de suma "+ iSuma);
        iSuma = iSuma + 10; //0 + 10
        System.out.println("Valor de suma " + iSuma);
        iSuma = iSuma + 10;
        System.out.println("Valor de suma " + iSuma);
        iSuma += 10; // "+=" OPERADOR DE INCREMENTO
        System.out.println("Valor de suma " + iSuma);
        
        //MULTIPLICACION
        int iMult = 1;
        System.out.println("Valor de iMult " + iMult);
        iMult = iMult * 5;
        System.out.println("Valor de iMult " + iMult);
        iMult *= 5;
        System.out.println("Valor de iMult " + iMult);
        
        //RESTA
        int iResta = 100;
        System.out.println("Valor de iResta " + iResta);
        iResta = iResta - 5;
        System.out.println("Valor de iResta " + iResta);
        iResta -= 5;
        System.out.println("Valor de iResta " + iResta);
        
        //CONTADOR:
        //TIPO ESPECIAL DE ACUMULADOR
        int iCont = 0;
        System.out.println("Cuanto tienes = " + iCont);
        iCont = iCont + 1;
        System.out.println("Cuanto tienes = " + iCont);
        iCont = iCont + 1;
        System.out.println("Cuanto tienes = " + iCont);
        iCont += 1; //INCREMENTA 
        System.out.println("Cuanto tienes = " + iCont);
        iCont++; //"++" SOLO INCREMENTA 1
        System.out.println("Cuanto tienes = " + iCont);
        
        String sCade = "Hola ";
        System.out.println(sCade);
        sCade = sCade + "Mundo";
        System.out.println(sCade);
                
                
    }
    
}
