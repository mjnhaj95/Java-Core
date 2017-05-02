
package DemoException;

/**
 *
 * @author Minh Hải
 */
public class ThoiGianException extends Throwable{

    @Override
    public String getMessage() {
        return "Giá trị truyền vào không đúng";
    }
    
}
