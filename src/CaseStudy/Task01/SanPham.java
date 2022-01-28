package CaseStudy.Task01;

import java.util.ArrayList;

public abstract class SanPham {
    private String MaSanPham;
    private String TenSanPham;
    private Integer SoLuong;
    private long DonGia;
    private String ThuocDanhMuc;

    public SanPham(String maSanPham, String tenSanPham, Integer soLuong, long donGia, String thuocDanhMuc) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        SoLuong = soLuong;
        DonGia = donGia;
        ThuocDanhMuc = thuocDanhMuc;
    }

    public abstract String HienThiThongTin(String MaSP);

    public abstract double PhanTramGiamGia(String KhachHang);

    public abstract void KhachHang();

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }

    public long getDonGia() {
        return DonGia;
    }

    public void setDonGia(long donGia) {
        DonGia = donGia;
    }

    public String getThuocDanhMuc() {
        return ThuocDanhMuc;
    }

    public void setThuocDanhMuc(String thuocDanhMuc) {
        ThuocDanhMuc = thuocDanhMuc;
    }
}
