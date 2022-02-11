package CaseStudy;

import CaseStudy.Task01.*;
import CaseStudy.Task03.Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_SACH ="src/CaseStudy/Task03/Data/Sach.csv";

    public static final String FILE_DODUNGHOCTAP ="src/CaseStudy/Task03/Data/DoDungHocTap.csv";

    public static final String FILE_DOCHOITREEM ="src/CaseStudy/Task03/Data/DoChoiTreEm.csv";

    public static final String FILE_HOADON ="src/CaseStudy/Task03/Data/HoaDon.csv";

    public static final String FILE_KHACHHANG ="src/CaseStudy/Task03/Data/KhachHang.csv";

    public static void main(String[] args) {
        SanPham sp1 = new Sach("SP01","Conan",12,20000,"Sách","NXB Kim Đồng"
                ,2021,"Thanh Hang",02/12/2021,"19");
        SanPham sp2 = new DoDungHocTap("SP02","Thước",34,5000,"Đồ dùng học tập","Hàn Quốc",
                "Hàn Quốc", "Made in Hàn Quốc","Sử dụng gạch kẻ trong học tập","Xanh da trời","Silicon","20cm");
        SanPham sp3 = new DoChoiTreEm("SP03","Búp bê",23,100000,"Đồ chơi trẻ em",
                "Hàn Quốc","Baby girls","Hàn Quốc","Chơi thú vui cho bé gái");
        SanPham sp4 = new Sach("SP04","Nhà giả kim",54,50000,"Sách","NXB Kim Đồng"
                ,2021,"Thanh Hang",02/12/2021,"43");

        // TASK 01 ----------------------------------------------------
        System.out.println("Phần trăm giảm giá: "+ sp1.PhanTramGiamGia("VIP1"));
        System.out.println("----------------------");
        System.out.println(sp1.HienThiThongTin(sp1.getMaSanPham()));

        List<Sach> listSach = new ArrayList<>();
        listSach.add((Sach) sp1);
        listSach.add((Sach) sp4);

        System.out.println("----------------------");


        //TASK 03 -----------------------------------------------------
//Sach
        //Create file Sach csv
//        IO_File.CreateFile();

        //Write file into Sach.csv
//        Sach_File.writeFile(FILE_SACH,listSach);
//        System.out.println("----------------------");

        //Read file from Sach.csv
//        Sach_File.readFile(FILE_SACH);

//DoChoiTreEm------------------------
//        List<DoChoiTreEm> listDoChoiTreEm = new ArrayList<>();
//        listDoChoiTreEm.add((DoChoiTreEm) sp3);
//
//        DoChoiTreEm_File.writeFile(FILE_DOCHOITREEM,listDoChoiTreEm);
//        System.out.println("----------------------");
//
//        DoChoiTreEm_File.readFile(FILE_DOCHOITREEM);
////Do dung hoc tap
//        List<DoDungHocTap> listDoDungHocTap = new ArrayList<>();
//        listDoDungHocTap.add((DoDungHocTap) sp2);
//
//        DoDungHocTap_File.writeFile(FILE_DODUNGHOCTAP,listDoDungHocTap);
//        System.out.println("----------------------");
//
//        DoDungHocTap_File.readFile(FILE_DODUNGHOCTAP);

//Khach Hang

        KhachHang kh = new KhachHang("KH01","Hải Yến","098374888","Yen@gmail.com","12/02/1999","VIP");
        List<KhachHang> listKH = new ArrayList<>();
        listKH.add(kh);

        KhachHang_File.writeFile(FILE_KHACHHANG,listKH);
        System.out.println("----------------------");

        KhachHang_File.readFile(FILE_KHACHHANG);

//Đơn hàng

        HoaDon hoadon = new HoaDon("HD01","KH01","SP01",12,"12/09/2021",600000);
        List<HoaDon> listHoaDon = new ArrayList<>();
        listHoaDon.add(hoadon);

        HoaDon_File.writeFile(FILE_HOADON,listHoaDon);
        System.out.println("----------------------");

        HoaDon_File.readFile(FILE_HOADON);

    }

}
