/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intf;

/**
 *
 * @author Minh Hải
 */
public class MyPhone implements IDienThoai{

    @Override
    public void hienThongTin() {
        System.out.println("Đây là điện thoại của tôi");
    }

    @Override
    public void sacPin(float dongDien) {
        System.out.println("Đang sạc dòng điện: " + dongDien);
    }
    
}
