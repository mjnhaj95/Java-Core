
package demoKeThua1;

/**
 *
 * @author Minh Hải
 */
public abstract class DongVat {
    private int ma;
    private String ten;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public DongVat() {
    }

    
    public DongVat(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    public abstract void an(String tenThucAn);
    // day là hàm ảo của class động vật
    // chỉ có khuôn dạng hàm, k có thân hàm
    // hàm này sinh ra để tất cả các class con phải cài đè nó
}
