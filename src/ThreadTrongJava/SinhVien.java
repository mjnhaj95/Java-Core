/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTrongJava;

/**
 *
 * @author Minh Hải
 */
public class SinhVien {
    private String ma;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public SinhVien() {
        ThongTinSinhVien   ttsv = new ThongTinSinhVien();
    }

    public SinhVien(String ma) {
        this.ma = ma;
    }
    
    class  ThongTinSinhVien{
        private String ten;

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public ThongTinSinhVien() {
        }

        public ThongTinSinhVien(String ten) {
            this.ten = ten;
        }
        public void inMa(){
            System.out.println("Ma = " + ma);
        }
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("fff");
        ThongTinSinhVien ttsv = sv.new ThongTinSinhVien();
        ttsv.inMa();
        
    }
    
}
