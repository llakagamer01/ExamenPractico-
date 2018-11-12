/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_while_perpetuo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author loque
 */
public class EVA2_20_WHILE_PERPETUO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true) {
            try {
                Thread.sleep(1000);
                System.out.println("Virus 100% real NO FEIK");
            } catch (InterruptedException ex) {
                Logger.getLogger(EVA2_20_WHILE_PERPETUO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
    }
