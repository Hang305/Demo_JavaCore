package CaseStudy.Task03.Model;

import CaseStudy.Task01.DoChoiTreEm;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class DoChoiTreEm_File {
    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<DoChoiTreEm> doChoiTreEm) {

        String line = null;
        //INPUT
        for (DoChoiTreEm listDoChoiTreEm : doChoiTreEm) {
            line = listDoChoiTreEm.getMaSanPham() + COMMA + listDoChoiTreEm.getTenSanPham() + COMMA + listDoChoiTreEm.getSoLuong() + COMMA + listDoChoiTreEm.getDonGia()
                    + COMMA + listDoChoiTreEm.getThuocDanhMuc() + COMMA+ listDoChoiTreEm.getNhaCungCap() + COMMA  + listDoChoiTreEm.getThuongHieu()
                    + COMMA + listDoChoiTreEm.getXuatXu() + COMMA + listDoChoiTreEm.getHuongDanSuDung();

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
