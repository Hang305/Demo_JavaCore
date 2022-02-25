package CaseStudy.Task04.View;

import CaseStudy.Task02.Control.BookController;
import CaseStudy.Task03.Model.BookFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book {
    Scanner scanner = new Scanner(System.in);
    String categoryBook;
    Integer publishYear, reprints;
    Date date = new Date();

    BookController bookController = new BookController();
    public static final String FILE_BOOK = "src/CaseStudy/Task03/Data/Book.csv";

    public void insertBook() {
        System.out.println("Enter book Id: ");
        String productID = scanner.nextLine();
        System.out.println("Enter book name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Enter unit: ");
        Long unit = scanner.nextLong();

        System.out.println("Please choose a category: ");
        System.out.println("\t 1: Literature");
        System.out.println("\t 2: Science");
        System.out.println("\t 3: Politics");
        System.out.println("\t 4: Religion");
        System.out.println("\t 5: Children");
        scanner.nextLine();
        String indexCategoryBook = scanner.nextLine();

        switch (indexCategoryBook) {
            case "1":
                categoryBook = "Literature";
                break;
            case "2":
                categoryBook = "Science";
                break;
            case "3":
                categoryBook = "Politics";
                break;
            case "4":
                categoryBook = "Religion";
                break;
            case "5":
                categoryBook = "Children";
                break;
            default:
                System.out.println("Input invalid!");
                break;
        }
        do {
            System.out.println("Enter publish year with the number from 1000 to 2022:");
            while (!scanner.hasNextInt()) {
                System.out.println("Input invalid! Enter publish year again: ");
                scanner.next();
            }
            publishYear = scanner.nextInt();

        } while (publishYear <= 1000 || publishYear > 2022);

        //Import publisher on file
        System.out.println("Enter publisher: ");
        scanner.nextLine();
        String publisher = scanner.nextLine();

        //Import author on file
        System.out.println("Enter author: ");
        String author = scanner.nextLine();

        //Import date on file and validate Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        boolean checkDate;
        do {
            try {
                checkDate = true;
                System.out.println("Enter publish date with format dd/MM/yyyy:");
                date = sdf.parse(scanner.nextLine());
            } catch (ParseException ex) {
                checkDate = false;
                System.out.print("Input invalid with format! ");
            }
        } while (!checkDate);

        //Import reprints on file and validate field
        do {
            System.out.println("Enter reprints with the positive number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input invalid! Enter reprints again: ");
                scanner.next();
            }
            reprints = scanner.nextInt();
        } while (reprints <= 0);

        //Insert data into file
        CaseStudy.Task01.Book listBooks = new CaseStudy.Task01.Book(productID, productName, quantity, unit, categoryBook, publishYear, publisher, author, date, reprints);
        bookController.addBook(listBooks);
        System.out.println("Insert data successfully!");

        //Import data into file csv
        BookFile.writeFile(FILE_BOOK, bookController.getListBook());

    }

    public void searchBookByName(){
        System.out.println("Enter name of book to search: ");
        String inputSearch = scanner.nextLine();
        bookController.searchBookByName(inputSearch).forEach(book -> System.out.println(book.toString()));
    }

    //Show data from file csv
    public void showInformation() {
        System.out.println("The book information list: ");
        bookController.showListInformationBook();
        //Read file from Book.csv
        BookFile.readFile(FILE_BOOK);
    }

}
