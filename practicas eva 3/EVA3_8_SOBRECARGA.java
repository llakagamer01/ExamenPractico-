/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_sobrecarga;

/**
 *
 * @author invitado
 */
public class EVA3_8_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        System.out.println(7);
        System.out.println(true);
        System.out.println(new EVA3_8_SOBRECARGA());
        
        
        System.out.println(suma(5,8));
        System.out.println(suma2("Hola"," Mundo"));
        
    }
    
    public static int suma(int  iVal1, int iVal2){
        return iVal1 + iVal2;
    }
    public static String suma2(String sCade1, String sCade2){
        return sCade1 + sCade2;
    }
    public static void suma(int iVal){
        
    }
}
