package CaseStudy.Task02;

import CaseStudy.Task01.Book;
import CaseStudy.Task01.ChildrenToy;
import CaseStudy.Task01.SchoolSupplies;
import CaseStudy.Task02.Control.BookController;
import CaseStudy.Task02.Control.ChildrenToyController;
import CaseStudy.Task02.Control.SchoolSuppliesController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void Menu() throws ParseException {

        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        ChildrenToyController toyController = new ChildrenToyController();
        SchoolSuppliesController schoolController = new SchoolSuppliesController();

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
                            System.out.println("Enter book Id: ");
                            String productID = scanner.nextLine();
                            System.out.println("Enter book name: ");
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
                            break;

                        case "toy":
                            System.out.println("Enter children Id: ");
                            String toyID = scanner.nextLine();
                            System.out.println("Enter children name: ");
                            String toyName = scanner.nextLine();
                            System.out.println("Enter quantity: ");
                            int quantityOfToy = scanner.nextInt();
                            System.out.println("Enter unit of book: ");
                            Long unitOfToy = scanner.nextLong();
                            System.out.println("Enter category name of book: ");
                            String categoryOfToy = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter origin of children toy: ");
                            String originOfToy = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter brand of book: ");
                            String brandOfToy = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter supplier of toy: ");
                            String supplierOfToy = scanner.nextLine();
                            System.out.println("Enter user manual of toy: ");
                            String userManualOfToy = scanner.nextLine();

                            ChildrenToy listToys = new ChildrenToy(toyID, toyName, quantityOfToy, unitOfToy, categoryOfToy, originOfToy, brandOfToy, supplierOfToy, userManualOfToy);
                            toyController.addChildrenToy(listToys);
                            toyController.showListInformationToy();
                            break;

                        case "school":
                            System.out.println("Enter school supplies Id: ");
                            String schoolSuppliesID = scanner.nextLine();
                            System.out.println("Enter school supplies name: ");
                            String schoolName = scanner.nextLine();
                            System.out.println("Enter quantity: ");
                            int quantityOfSchool = scanner.nextInt();
                            System.out.println("Enter unit of School: ");
                            Long unitOfSchool = scanner.nextLong();
                            System.out.println("Enter category name of School: ");
                            String categoryOfSchool = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter origin of school supplies: ");
                            String originOfSchool = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter brand of School supplies: ");
                            String brandOfSchool = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter supplier of school supplies: ");
                            String supplierOfSchool = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter user manual of school supplies: ");
                            String userManualOfSchool = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter color of school supplies: ");
                            String colorlOfSchool = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter material of school supplies: ");
                            String materialOfSchool = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter size of school supplies: ");
                            String sizeOfSchool = scanner.nextLine();

                            SchoolSupplies listSchools = new SchoolSupplies(schoolSuppliesID, schoolName, quantityOfSchool, unitOfSchool, categoryOfSchool, originOfSchool, brandOfSchool, supplierOfSchool
                                    , userManualOfSchool,colorlOfSchool,materialOfSchool,sizeOfSchool);
                            schoolController.addSchool(listSchools);
                            schoolController.showListInformationSchool();
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
