package CaseStudy;

import CaseStudy.Task02.Menu;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
//        Product sp1 = new Book("SP01","Conan",12,20000,"Sách","NXB Kim Đồng"
//                ,2021,"Thanh Hang","02/12/2021","19");
//        Product sp2 = new SchoolSupplies("SP02","Thước",34,5000,"Đồ dùng học tập","Hàn Quốc",
//                "Hàn Quốc", "Made in Hàn Quốc","Sử dụng gạch kẻ trong học tập","Xanh da trời","Silicon","20cm");
//        Product sp3 = new ChildrenToy("SP03","Búp bê",23,100000,"Đồ chơi trẻ em",
//                "Hàn Quốc","Baby girls","Hàn Quốc","Chơi thú vui cho bé gái");
//        Product sp4 = new Book("SP04","Nhà giả kim",54,50000,"Sách","NXB Kim Đồng"
//                ,2021,"Thanh Hang",02/12/2021,"43");

        // TASK 01 ----------------------------------------------------
//        System.out.println("Phần trăm giảm giá: "+ sp1.discountPercent("VIP1"));
//        System.out.println("----------------------");
//        System.out.println(sp1.getInformation(sp1.getCategoryName()));

        //TASK 03 ----------------------------------------------------

//Customer

//        Customer kh = new Customer("KH01","Hải Yến","098374888","Yen@gmail.com","12/02/1999","VIP");
//        List<Customer> listKH = new ArrayList<>();
//        listKH.add(kh);
//
//        Customer_File.writeFile(FILE_CUSTOMER,listKH);
//        System.out.println("----------------------");
//
//        Customer_File.readFile(FILE_CUSTOMER);

//        TASK 02---------------------------------------------------------
        Menu menu = new Menu();
        menu.Menu();
    }

}
