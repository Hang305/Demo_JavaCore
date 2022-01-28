package CaseStudy.Task01;

import java.util.ArrayList;
import java.util.List;

public class DanhMuc{

    private Integer MaDanhMuc;
    private String LoaiDanhMuc;
    private String Mota;

    public String convertIDToNameDM(Integer name){
        switch (name){
            case 0:
                return  "Sách";
            case 1:
                return "Đồ dùng học tập";
            default:
                return "Đồ chơi trẻ em";
        }
    }

    public String[] checkDanhMuc(String danhmuc){
        switch (danhmuc){
            case "Sach":
               String[] list = {"Văn Học", "Khoa học", "Chính trị", "Tôn Giáo", "Thiếu nhi"};
                return  list;
            case "DoChoiTreEm":
                String[] dochoitreem = {"Nhóm 0-3 tuổi", "Nhóm 4-8 tuổi", "Nhóm trên 8 tuổi"};
                return dochoitreem;
             default:
                String[] dodunghoctap = {"Tiểu học","Trung học","Phổ thông"};
                return dodunghoctap;
        }
    }


}
