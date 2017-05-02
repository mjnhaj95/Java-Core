
package DemoException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Minh Hải
 */
public class Main {
    public static void main(String[] args) throws Exception {
       
        
        
        try {
             int a, b, c;
            System.out.println("Nhập a:");
            a = new Scanner(System.in).nextInt();
            System.out.println("Nhập b:");
            b = new Scanner(System.in).nextInt();
            if (a < 0 || b < 0) {
                Exception exAm = new InputMismatchException("Sự cố số âm");
                throw exAm;
            }
            
            c = a/b;
            System.out.println("c = "+ c);
        } catch (InputMismatchException e) {
//            e.printStackTrace();
             System.out.println("Gặp sự cố nhấp sai kiểu dữ liệu");
        } catch(ArithmeticException e){
            System.out.println("Gặp sự cố chia cho 0");
        }
       
       
    }
}
