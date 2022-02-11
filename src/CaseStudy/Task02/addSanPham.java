package CaseStudy.Task02;

import java.util.Scanner;

public class addSanPham {

    Scanner scan = new Scanner(System.in);

    public void ThemSanPham(String LoaiSP) {
        switch(LoaiSP){
            case "Sach":
                ThemSach();
                break;
            case "Dochoitreem":
                ThemDoChoiTreEm();
                break;
            default:
                ThemDoDungHocTap();
        }

    }
    public static void ThemSach(){

    }
    public static void ThemDoChoiTreEm(){

    }
    public static void ThemDoDungHocTap(){

    }

}
