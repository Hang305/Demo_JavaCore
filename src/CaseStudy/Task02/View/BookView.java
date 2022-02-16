package CaseStudy.Task02.View;

import CaseStudy.Task02.MainmenuControll;

import java.util.Scanner;

public class BookView {
    Scanner scanner = new Scanner(System.in);
    MainmenuControll menu = new MainmenuControll();

    public void checkProducts(){
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
