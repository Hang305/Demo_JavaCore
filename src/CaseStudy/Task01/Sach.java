package CaseStudy.Task01;

import java.util.ArrayList;

public class Sach extends SanPham{
    private String NhaXuatBan;
    private Integer NamXuatBan;
    private String TacGia;
    private int NgayXuatBan;
    private String LanTaiBan;

    public Sach(String maSanPham, String tenSanPham, Integer soLuong, long donGia, String thuocDanhMuc, String nhaXuatBan, Integer namXuatBan,
                String tacGia, int ngayXuatBan, String lanTaiBan) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        NhaXuatBan = nhaXuatBan;
        NamXuatBan = namXuatBan;
        TacGia = tacGia;
        NgayXuatBan = ngayXuatBan;
        LanTaiBan = lanTaiBan;
    }

    @Override
    public String HienThiThongTin(String MaSP) {

       return "Mã sản phẩm: " + this.getMaSanPham()+  "\n Tên sản phẩm: " + this.getTenSanPham() + "\n Số lượng: "+ this.getSoLuong() + "\n Đơn giá: "+ this.getDonGia() +
               "\n Thuộc danh mục:"+ this.getThuocDanhMuc()+ "\n Nhà xuất bản:" + this.NhaXuatBan+ "\n Năm xuất bản: "+ this.NamXuatBan+ "\n Tác giả: "+ this.TacGia+
               "\n Ngày xuất bản: " + this.NgayXuatBan + "\n Lần tái bản: "+ this.LanTaiBan;
    }

    @Override
    public double PhanTramGiamGia(String khachhang) {

        switch (khachhang){
            case "VIP1":
                return 0.05;
            case "VIP2":
                return 0.1;
            default: return 0.02;
        }

    }

    @Override
    public void KhachHang() {

    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        NhaXuatBan = nhaXuatBan;
    }

    public Integer getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(Integer namXuatBan) {
        NamXuatBan = namXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public int getNgayXuatBan() {
        return NgayXuatBan;
    }

    public void setNgayXuatBan(int ngayXuatBan) {
        NgayXuatBan = ngayXuatBan;
    }

    public String getLanTaiBan() {
        return LanTaiBan;
    }

    public void setLanTaiBan(String lanTaiBan) {
        LanTaiBan = lanTaiBan;
    }
}
