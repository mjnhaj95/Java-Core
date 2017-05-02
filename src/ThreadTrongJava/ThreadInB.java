/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTrongJava;

/**
 *
 * @author Minh Hải
 */
public class ThreadInB extends Thread{

    @Override
    public void run() { // Giông như hàm main
        // Toàn bộ code xử lý của Luồng để vào đây
        
        
        for (int i = 0; i < 100; i++) {
            System.out.print("B");
        }
    }
    
}
