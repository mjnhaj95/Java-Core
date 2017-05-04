package demoIO;

import java.io.FileInputStream;
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
public class docFile {
    public static void main(String[] args) {
        FileInputStream FileIn = null;
        try {
            FileIn = new FileInputStream("demo.txt");
            while (true) {                
//                int read = FileIn.read();
                char read = (char)FileIn.read();

                System.out.println(read);
                if(FileIn.available() == 0){
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(docFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(docFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                FileIn.close();
            } catch (IOException ex) {
                Logger.getLogger(docFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
