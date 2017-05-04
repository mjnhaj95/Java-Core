
package demoIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Hải
 */
public class DemoBuffWriterrrrr {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("demo2.txt", true));
            System.out.println("MỜi bạn nhập 3 dòng text");
            for (int i = 0; i < 3; i++) {
                String s = new Scanner(System.in).nextLine();
                writer.write( s + "\n");
                
            }
            writer.flush();
        } catch (IOException ex) {
            Logger.getLogger(DemoBuffWriterrrrr.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoBuffWriterrrrr.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
