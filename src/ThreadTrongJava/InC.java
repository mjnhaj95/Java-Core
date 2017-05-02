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
public class InC implements Runnable{

    @Override
    public void run() {
         for (int i = 0; i < 100; i++) {
            try {
                System.out.print("C");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
