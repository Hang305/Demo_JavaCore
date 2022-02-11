package CaseStudy.Task01;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class KhachHang {

    private String MaKH;
    private String HoTen;
    private String SDT;
    private String Email;
    private String NgaySinh;
    private String LoaiKH;

    public String getLoaiKH() {
        return LoaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        LoaiKH = loaiKH;
    }

    public KhachHang(String maKH, String hoTen, String SDT, String email, String ngaySinh, String loaiKH) {
        MaKH = maKH;
        HoTen = hoTen;
        this.SDT = SDT;
        Email = email;
        NgaySinh = ngaySinh;
        LoaiKH = loaiKH;
    }


    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }
}
