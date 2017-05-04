
package DongBoLuong;

/**
 *
 * @author Minh Hải
 */
public class Data {
    private int a;
    private int b;
    private int laCo;

    public int getLaCo() {
        return laCo;
    }

    public void setLaCo(int laCo) {
        this.laCo = laCo;
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int tinhTong(){
        return a + b;
    }
}
