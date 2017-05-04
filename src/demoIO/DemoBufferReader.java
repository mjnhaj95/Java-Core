
package demoIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Hải
 */
public class DemoBufferReader {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("demo2.txt"));
            while (true) {                
                String readLine = reader.readLine();
                if(readLine == null){
                    break;
                }
                System.out.println(readLine);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoBufferReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoBufferReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoBufferReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
