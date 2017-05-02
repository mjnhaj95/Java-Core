    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTrongJava;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Minh Hải
 */
public class Main {
    public static void main(String[] args) {
        ThreadInB threadInB = new ThreadInB();
        threadInB.start(); 
        
        // Cách tạo 2 thread
         InC inC = new InC();
         // ong nuoc
//         Thread threadC = new Thread(inC);
//         threadC.start();

        new Thread(inC).start();
        
        for (int i = 0; i < 100; i++) {
            try {
                System.out.print("A");
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
    }
}
