package demoIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Hải
 */
public class demoIO {
    public static void main(String[] args) {
        FileOutputStream FileOut = null;
        try {
            FileOut = new FileOutputStream("demo.txt", true);
            System.out.println("Mời bạn nhập dữ liệu cần ghi: ");
            int n = new Scanner(System.in).nextInt();
            String s = String.valueOf(n);
            try {
                FileOut.write(s.getBytes());       
            } catch (IOException ex) {
                Logger.getLogger(demoIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(demoIO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                FileOut.close();
            } catch (IOException ex) {
                Logger.getLogger(demoIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          
    }
}
