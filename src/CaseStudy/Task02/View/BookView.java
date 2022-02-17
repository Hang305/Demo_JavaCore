package CaseStudy.Task02.View;

import CaseStudy.Task02.Control.BookController;

import CaseStudy.Task01.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookView {

    public static void main(String[] args) throws ParseException {
        Menu();
    }

    public static void Menu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        while (true) {

            System.out.println("Application Manager Products");
            System.out.println("Enter 1: To insert product");
            System.out.println("Enter 2: To search products by name: ");
            System.out.println("Enter 3: To show information products");
            System.out.println("Enter 4: To exit:");

            String line = scanner.nextLine();

            switch (line) {
                case "1":
                    System.out.println("Enter book: to insert book");
                    System.out.println("Enter toy: to insert children toy");
                    System.out.println("Enter school: to insert school supplies");

                    String type = scanner.nextLine();

                    switch (type) {
                        case "book":
                            System.out.println("Enter product Id: ");
                            String productID = scanner.nextLine();

                            System.out.println("Enter product name: ");
                            String productName = scanner.nextLine();
                            System.out.println("Enter quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.println("Enter unit of book: ");
                            Long unit = scanner.nextLong();

                            System.out.println("Enter category name of book: ");
                            String category = scanner.nextLine();
                            scanner.nextLine();

                            System.out.println("Enter publish year of book: ");
                            Integer publishYear = scanner.nextInt();

                            System.out.println("Enter publisher of book: ");
                            String publisher = scanner.nextLine();
                            scanner.nextLine();

                            System.out.println("Enter author name of book: ");
                            String author = scanner.nextLine();

                            System.out.println("Enter publish date of book: ");
                            String publishDate = scanner.nextLine();

                            System.out.println("Enter reprints of book: ");
                            String reprints = scanner.nextLine();

                            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(publishDate);
                            Book listBooks = new Book(productID, productName, quantity, unit, category, publishYear, publisher, author, date, reprints);


//                            System.out.println(listBooks.toString());
//                            System.out.println(bookController.toString());
                            bookController.addBook(listBooks);
                            bookController.showListInformationBook();
                    }
                case "2":
                    System.out.println("Enter name of book to search: ");
                    String inputSearch = scanner.nextLine();
                    bookController.searchBookByName(inputSearch).forEach(book -> System.out.println(book.toString()));
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid input !");
                    break;
            }

        }
    }

}
