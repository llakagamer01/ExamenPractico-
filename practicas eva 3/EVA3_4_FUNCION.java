/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_funcion;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PARA USAR LA FUNCION --> LLAMADA A FUNCION
        Main mObjeto = new Main();
        mObjeto.imprimeMensaje("Eduardo");
        Math.random();
              
        
    }
    //PARADIGMAS DE PROGRAMACION:
    // PROGRAMACION ESTRUCTURADA
    // PROGRAMACION MODULAR, ORIENTADA A OBJETOS,
    // ORIENTADA A EVENTOS, LOGICA, FUNCIONAL
    
    //OOP
    //publico privado protegido default
    //nivel de acceso valor de retorno nombre de la funcion
    //valor de retorno nombre de la funcion (argumentos)
    //{cuerpo de la funcion
    //FUNCIONES --> REGRESAN UN VALOR
    //PROCEDIMIENTOS --> NO REGRESAN NADA
    void imprimeMensaje(String mensaje){
        System.out.println("Hola" + mensaje);
    
    }
    }
    

