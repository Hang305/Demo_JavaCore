package CaseStudy.Task01;

public class DoDungHocTap extends SanPham{

    private String XuatXu;
    private String ThuongHieu;
    private String NhaCungCap;
    private String HuongDanSuDung;
    private String MauSac;
    private String ChatLieu;
    private String KichThuoc;

    public DoDungHocTap(String maSanPham, String tenSanPham, Integer soLuong, long donGia, String thuocDanhMuc, String xuatXu, String thuongHieu,
                        String nhaCungCap, String huongDanSuDung, String mauSac, String chatLieu, String kichThuoc) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        XuatXu = xuatXu;
        ThuongHieu = thuongHieu;
        NhaCungCap = nhaCungCap;
        HuongDanSuDung = huongDanSuDung;
        MauSac = mauSac;
        ChatLieu = chatLieu;
        KichThuoc = kichThuoc;
    }

    @Override
    public String HienThiThongTin(String MaSP) {

        return " Mã sản phẩm: " + this.getMaSanPham()+  "\n Tên sản phẩm: " + this.getTenSanPham() + "\n Số lượng: "+ this.getSoLuong() + "\n Đơn giá: "+ this.getDonGia() +
                "\n Thuộc danh mục: "+ this.getThuocDanhMuc()+ "\n Xuất xứ: " + this.XuatXu+ "\n Thương hiệu: "+ this.ThuongHieu+ "\n Nhà cung cấp: "+ this.NhaCungCap+
                "\n Hướng dẫn sử dụng: " + this.HuongDanSuDung + "\n Màu sắc: "+ this.MauSac+ "\n Chất liệu: "+ this.ChatLieu+ "\n Kích thước: "+ this.KichThuoc;
    }

    @Override
    public double PhanTramGiamGia(String khachhang) {

        switch (khachhang){
            case "VIP1":
                return 0.03;
            case "VIP2":
                return 0.07;
            default: return 0.01;
        }

    }

    @Override
    public void KhachHang() {

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

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String chatLieu) {
        ChatLieu = chatLieu;
    }

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        KichThuoc = kichThuoc;
    }

    @Override
    public String toString() {
        return "DoDungHocTap{" +
                "XuatXu='" + XuatXu + '\'' +
                ", ThuongHieu='" + ThuongHieu + '\'' +
                ", NhaCungCap='" + NhaCungCap + '\'' +
                ", HuongDanSuDung='" + HuongDanSuDung + '\'' +
                ", MauSac='" + MauSac + '\'' +
                ", ChatLieu='" + ChatLieu + '\'' +
                ", KichThuoc='" + KichThuoc + '\'' +
                '}';
    }
}
