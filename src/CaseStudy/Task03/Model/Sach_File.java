package CaseStudy.Task03.Model;

import CaseStudy.Task01.Sach;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;


public class Sach_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<Sach>sachs) {

        String line = null;
        //INPUT
        for (Sach listSach : sachs) {
            line = listSach.getMaSanPham() + COMMA + listSach.getTenSanPham() + COMMA + listSach.getSoLuong() + COMMA + listSach.getDonGia() + COMMA + listSach.getThuocDanhMuc() + COMMA
                    + listSach.getNhaXuatBan() + COMMA  + listSach.getLanTaiBan() + COMMA + listSach.getTacGia() + COMMA + listSach.getNgayXuatBan() + COMMA + listSach.getNamXuatBan();

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
