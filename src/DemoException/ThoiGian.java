package DemoException;

/**
 *
 * @author Minh Hải
 */
public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) throws Exception {
        // ham nay co the phat sinh ra ngoai le
        // nen ai goi la phai xu ly  
        
        if (ngay < 0 || ngay > 31) {
            throw ThoiGianException();
        }
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public ThoiGian() {
    }

    public ThoiGian(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    private Exception ThoiGianException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
