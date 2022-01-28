package CaseStudy.Task01;

public class Main {

    public static void main(String[] args) {

        SanPham sp1 = new Sach("Sach01","Conan",12,20000,"Sách","NXB Kim Đồng"
                ,2021,"Thanh Hang",02/12/2021,"19");
        SanPham sp2 = new Sach("DoDung01","Thước",34,5000,"Đồ dùng học tập","NXB nhựa"
                ,2021,"Thanh Hang",02/12/2021,"19");
        SanPham sp3 = new Sach("DoChoi01","Búp bê",23,100000,"Đồ chơi trẻ em","NXB Minh Tiến"
                ,2021,"Thanh Hang",02/12/2021,"19");
        SanPham sp4 = new Sach("DoDung02","Hộp bút",54,50000,"Đồ dùng học tập","NXB nhựa"
                ,2021,"Thanh Hang",02/12/2021,"19");

        System.out.println("Phần trăm giảm giá: "+ sp1.PhanTramGiamGia("VIP1"));
        System.out.println("----------------------");
        System.out.println(sp3.HienThiThongTin(sp3.getMaSanPham()));


    }
}
