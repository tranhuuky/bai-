/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iso.edu.vn.khachhangdemo;

public class KhachHang {
        private String ID;
        private String name;
        private String gioitinh;
        private String diachi;
        private String dienthoai;

    public KhachHang(String ID, String name, String gioitinh, String diachi, String dienthoai) {
        this.ID = ID;
        this.name = name;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }
        
}
