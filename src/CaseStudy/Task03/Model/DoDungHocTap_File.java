package CaseStudy.Task03.Model;

import CaseStudy.Task01.DoChoiTreEm;
import CaseStudy.Task01.DoDungHocTap;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class DoDungHocTap_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<DoDungHocTap> doDungHocTap) {

        String line = null;
        //INPUT
        for (DoDungHocTap listDoDungHocTap : doDungHocTap) {
            line = listDoDungHocTap.getMaSanPham() + COMMA + listDoDungHocTap.getTenSanPham() + COMMA + listDoDungHocTap.getSoLuong() + COMMA + listDoDungHocTap.getDonGia()
                    + COMMA + listDoDungHocTap.getThuocDanhMuc() + COMMA+ listDoDungHocTap.getNhaCungCap() + COMMA  + listDoDungHocTap.getThuongHieu()
                    + COMMA + listDoDungHocTap.getXuatXu() + COMMA + listDoDungHocTap.getHuongDanSuDung();

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
