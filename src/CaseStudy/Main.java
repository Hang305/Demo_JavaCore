package CaseStudy;

import CaseStudy.Task01.*;
import CaseStudy.Task02.MainmenuControll;
import CaseStudy.Task03.Common.IO_File;
import CaseStudy.Task03.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String FILE_BOOK ="src/CaseStudy/Task03/Data/Book.csv";

    public static final String FILE_SCHOOLSUPPLIES ="src/CaseStudy/Task03/Data/SchoolSupplies.csv";

    public static final String FILE_CHILDRENTOY ="src/CaseStudy/Task03/Data/ChildrenToy.csv";

    public static final String FILE_BILL ="src/CaseStudy/Task03/Data/Bill.csv";

    public static final String FILE_CUSTOMER="src/CaseStudy/Task03/Data/Customer.csv";

    public static void main(String[] args) {
        Product sp1 = new Book("SP01","Conan",12,20000,"Sách","NXB Kim Đồng"
                ,2021,"Thanh Hang","02/12/2021","19");
        Product sp2 = new SchoolSupplies("SP02","Thước",34,5000,"Đồ dùng học tập","Hàn Quốc",
                "Hàn Quốc", "Made in Hàn Quốc","Sử dụng gạch kẻ trong học tập","Xanh da trời","Silicon","20cm");
        Product sp3 = new ChildrenToy("SP03","Búp bê",23,100000,"Đồ chơi trẻ em",
                "Hàn Quốc","Baby girls","Hàn Quốc","Chơi thú vui cho bé gái");
        Product sp4 = new Book("SP04","Nhà giả kim",54,50000,"Sách","NXB Kim Đồng"
                ,2021,"Thanh Hang","02/12/2021","43");

        // TASK 01 ----------------------------------------------------
        System.out.println("Phần trăm giảm giá: "+ sp1.discountPercent("VIP1"));
        System.out.println("----------------------");
        System.out.println(sp1.getInformation(sp1.getCategoryName()));




        //TASK 03 -----------------------------------------------------
//Sach
        //Create file Sach csv
//        IO_File.createFile();

        //Write file into Book.csv
//        List<Book> listSach = new ArrayList<>();
//        listSach.add((Book) sp1);
//        listSach.add((Book) sp4);
//
//        System.out.println("----------------------");
//        Book_File.writeFile(FILE_BOOK,listSach);
//        System.out.println("----------------------");
//
//        //Read file from Book.csv
//        Book_File.readFile(FILE_BOOK);

//DoChoiTreEm------------------------
//        List<ChildrenToy> listChildrenToy = new ArrayList<>();
//        listChildrenToy.add((ChildrenToy) sp3);
//
//        ChildrenToy_File.writeFile(FILE_CHILDRENTOY,listChildrenToy);
//        System.out.println("----------------------");
//        ChildrenToy_File.readFile(FILE_CHILDRENTOY);
//Do dung hoc tap
//        List<SchoolSupplies> listSchoolSupplies = new ArrayList<>();
//        listSchoolSupplies.add((SchoolSupplies) sp2);
//
//        SchoolSupplies_File.writeFile(FILE_SCHOOLSUPPLIES,listSchoolSupplies);
//        System.out.println("----------------------");
//
//        SchoolSupplies_File.readFile(FILE_SCHOOLSUPPLIES);

//Khach Hang

//        Customer kh = new Customer("KH01","Hải Yến","098374888","Yen@gmail.com","12/02/1999","VIP");
//        List<Customer> listKH = new ArrayList<>();
//        listKH.add(kh);
//
//        Customer_File.writeFile(FILE_CUSTOMER,listKH);
//        System.out.println("----------------------");
//
//        Customer_File.readFile(FILE_CUSTOMER);

//Đơn hàng

//        Bill hoadon = new Bill("HD01","KH01","SP01",12,"12/09/2021",600000);
//        List<Bill> listHoaDon = new ArrayList<>();
//        listHoaDon.add(hoadon);
//
//        Bill_File.writeFile(FILE_BILL,listHoaDon);
////        System.out.println("----------------------");
//
//        Bill_File.readFile(FILE_BILL);


        Scanner scanner = new Scanner(System.in);
        MainmenuControll menu = new MainmenuControll();


        while(true){

            System.out.println("Application Manager Products");
            System.out.println("Enter 1: To insert product");
            System.out.println("Enter 2: To search products by name: ");
            System.out.println("Enter 3: To show information products");
            System.out.println("Enter 4: To exit:");

            String line = scanner.nextLine();

            switch(line){
                case "1":
                    System.out.println("Enter book: to insert book");
                    System.out.println("Enter toy: to insert children toy");
                    System.out.println("Enter school: to insert school supplies");

                    String type = scanner.nextLine();

                    switch(type){
                        case "book":
                            System.out.println("Enter product Id: ");
                            String productID = scanner.nextLine();
                            System.out.println("Enter product name: ");
                            String productName = scanner.nextLine();
                            System.out.println("Enter quantity: ");
                            int quantity = scanner.nextInt();
                            System.out.println("Enter unit of book: ");
                            String unit = scanner.nextLine();
                            System.out.println("Enter category name of book: ");
                            String category = scanner.nextLine();
                            System.out.println("Enter publisher of book: ");
                            String publisher = scanner.nextLine();
                            System.out.println("Enter publish year of book: ");
                            String publishYear = scanner.nextLine();
                            System.out.println("Enter author name of book: ");
                            String author = scanner.nextLine();
                            System.out.println("Enter publish date of book: ");
                            String publishDate = scanner.nextLine();
                            System.out.println("Enter reprints of book: ");
                            String reprints = scanner.nextLine();
//                       Product listBooks = new Book();

                    }
            }

        }
    }

}
