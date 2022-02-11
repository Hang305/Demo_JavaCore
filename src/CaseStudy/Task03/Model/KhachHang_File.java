package CaseStudy.Task03.Model;

import CaseStudy.Task01.DoDungHocTap;
import CaseStudy.Task01.KhachHang;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class KhachHang_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<KhachHang> kh) {

        String line = null;
        //INPUT
        for (KhachHang listKH : kh) {
            line = listKH.getLoaiKH() + COMMA + listKH.getMaKH() + COMMA + listKH.getHoTen() + COMMA + listKH.getNgaySinh()
                    + COMMA + listKH.getEmail() + COMMA+ listKH.getSDT();

            System.out.println(line);
            Read_Write.writeFile(pathFile, line);
        }
    }

    //Output
    public static List<String> readFile(String pathFile) {

        //OUTPUT
        List<String> listLine = Read_Write.readFile(pathFile);
//        System.out.println(listLine);

        return listLine;
    }
}
