
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
        boolean pass = false ; int Intentos=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Registra tu usuario");
        String U = input.nextLine();
        System.out.println("Regista tu contraseña");
        String P = input.nextLine();
        
        
         //prueba
        System.out.println("Ingresa tu usuario");
        String usuario = input.nextLine();
        System.out.println("Ingresa tu contraseña");
        String cntra = input.nextLine(); 
        
        if (UU.equals(U) && PP.equals(P)){
            System.out.println("Bienvenido");
        }
            else{ pass = true ;
            while(pass){
                System.out.println("Verifica tus datos ");
                System.out.println("Ingresa tu usuario");
                usuario = input.nextLine();
                System.out.println("Ingresa tu contraseña");
                cntra = input.nextLine();
                Intentos++;
                if (U.equals(UU) && P.equals (PP)){pass = false; System.out.println("Bienvenido");
                }
                if(Intentos ==3){System.out.println("Acceso denegado."); pass = false;}
                }
            }
        }
    }
    

