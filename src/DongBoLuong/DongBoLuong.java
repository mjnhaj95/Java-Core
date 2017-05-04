package DongBoLuong;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Hải
 */

public class DongBoLuong {
    static Data dataShare;
    
    public static void main(String[] args) {
        dataShare = new Data();
        dataShare.setLaCo(1);
        //Quy uoc: 1 -> A dung, 2 -> B dung, 3-> dung
        
        
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
               synchronized(dataShare){
                for (int i = 0; i < 100; i++) {
                    try {
                        
                        if(dataShare.getLaCo()== 1){
                            int a = new Random().nextInt(100);
                            dataShare.setA(a);
                            System.out.println("A = "+dataShare.getA());
                             Thread.sleep(8);
                             dataShare.setLaCo(2);// Chuyen co sang 2 con lam viec
                             dataShare.notifyAll();// thong bao cho tat ca cac thread dang ngu biet ma day
                        }
                        else{
                            // thi tam dung va cho doi
                            dataShare.wait();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DongBoLuong.class.getName()).log(Level.SEVERE, null, ex);
                    }      
                }
                
            }}
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                  synchronized(dataShare){
                for (int i = 0; i < 100; i++) {
                    try {
                        if(dataShare.getLaCo()==2){
                            int a = new Random().nextInt(100);
                            dataShare.setB(a);
                            System.out.println("B= " +dataShare.getB());
                            Thread.sleep(9);
                            dataShare.setLaCo(3);// chuyen co sang 3
                            dataShare.notifyAll();
                        }
                        else
                        { 
                            dataShare.wait();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DongBoLuong.class.getName()).log(Level.SEVERE, null, ex);
                    }      
                }}
            }
        });
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
               synchronized(dataShare){
                for (int i = 0; i < 100; i++) {
                    try {
                        if(dataShare.getLaCo() == 3){
                            System.out.println("Tong = " + dataShare.tinhTong());
                            Thread.sleep(10);
                            dataShare.setLaCo(1);// Chuyen co ve 1
                            dataShare.notifyAll();
                        }else
                        {
                             dataShare.wait();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DongBoLuong.class.getName()).log(Level.SEVERE, null, ex);
                    }      
                }}
                
            }
        });
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
