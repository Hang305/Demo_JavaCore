package CaseStudy.Task03.Model;

import CaseStudy.Task01.HoaDon;
import CaseStudy.Task01.KhachHang;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class HoaDon_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<HoaDon> hoadon) {

        String line = null;

        //INPUT
        for (HoaDon listHoaDon : hoadon) {
            line = listHoaDon.getMaHD() + COMMA + listHoaDon.getMaKH() + COMMA + listHoaDon.getMaSP() + COMMA + listHoaDon.getNgayMua()
                    + COMMA + listHoaDon.getDonGia() + COMMA+ listHoaDon.getSoLuong() + COMMA+ listHoaDon.getTongTien();

//            System.out.println(line);
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
