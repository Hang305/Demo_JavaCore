package CaseStudy.Task01;

import java.util.Date;

public class HoaDon {

    private String MaHD;
    private String MaKH;
    private String MaSP;
    private Integer SoLuong;
    private String NgayMua;
    private long DonGia;
    private long TongTien;

    public HoaDon(String maHD) {
        MaHD = maHD;
    }

    public HoaDon(String maHD, String maKH, String maSP, Integer soLuong, String ngayMua, long donGia) {
        MaHD = maHD;
        MaKH = maKH;
        MaSP = maSP;
        SoLuong = soLuong;
        NgayMua = ngayMua;
        DonGia = donGia;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        MaHD = maHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }

    public String getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(String ngayMua) {
        NgayMua = ngayMua;
    }

    public long getDonGia() {
        return DonGia;
    }

    public void setDonGia(long donGia) {
        DonGia = donGia;
    }

    public long getTongTien() {
        return SoLuong*DonGia;
    }

    public void setTongTien(long tongTien) {
        TongTien = tongTien;
    }

}
