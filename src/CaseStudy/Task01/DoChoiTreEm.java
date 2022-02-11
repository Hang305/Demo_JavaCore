package CaseStudy.Task01;

public class DoChoiTreEm extends SanPham{

    private String XuatXu;
    private String ThuongHieu;
    private String NhaCungCap;
    private String HuongDanSuDung;

    @Override
    public String HienThiThongTin(String MaSP) {

        return " Mã sản phẩm: " + this.getMaSanPham()+  "\n Tên sản phẩm: " + this.getTenSanPham() + "\n Số lượng: "+ this.getSoLuong() + "\n Đơn giá: "+ this.getDonGia() +
                "\n Thuộc danh mục: "+ this.getThuocDanhMuc()+ "\n Xuất xứ: " + this.XuatXu+ "\n Thương hiệu: "+ this.ThuongHieu+ "\n Nhà cung cấp: "+ this.NhaCungCap+
                "\n Hướng dẫn sử dụng: " + this.HuongDanSuDung;
    }

    @Override
    public double PhanTramGiamGia(String khachhang) {

        switch (khachhang){
            case "VIP1":
                return 0.05;
            case "VIP2":
                return 0.07;
            default: return 0.02;
        }

    }

    @Override
    public void KhachHang() {

    }

    public DoChoiTreEm(String maSanPham, String tenSanPham, Integer soLuong, long donGia,
                       String thuocDanhMuc, String xuatXu, String thuongHieu, String nhaCungCap, String huongDanSuDung) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        XuatXu = xuatXu;
        ThuongHieu = thuongHieu;
        NhaCungCap = nhaCungCap;
        HuongDanSuDung = huongDanSuDung;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String xuatXu) {
        XuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        ThuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        NhaCungCap = nhaCungCap;
    }

    public String getHuongDanSuDung() {
        return HuongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        HuongDanSuDung = huongDanSuDung;
    }

    @Override
    public String toString() {
        return "DoChoiTreEm{" +
                "XuatXu='" + XuatXu + '\'' +
                ", ThuongHieu='" + ThuongHieu + '\'' +
                ", NhaCungCap='" + NhaCungCap + '\'' +
                ", HuongDanSuDung='" + HuongDanSuDung + '\'' +
                '}';
    }
}
