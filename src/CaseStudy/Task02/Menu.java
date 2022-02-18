package CaseStudy.Task02;

import CaseStudy.Task01.Book;
import CaseStudy.Task01.ChildrenToy;
import CaseStudy.Task01.Order;
import CaseStudy.Task01.SchoolSupplies;
import CaseStudy.Task02.Control.*;
import CaseStudy.Task03.Model.Book_File;
import CaseStudy.Task03.Model.ChildrenToy_File;
import CaseStudy.Task03.Model.Order_File;
import CaseStudy.Task03.Model.SchoolSupplies_File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    public static final String FILE_BOOK = "src/CaseStudy/Task03/Data/Book.csv";
    public static final String FILE_SCHOOLSUPPLIES = "src/CaseStudy/Task03/Data/SchoolSupplies.csv";
    public static final String FILE_CHILDRENTOY = "src/CaseStudy/Task03/Data/ChildrenToy.csv";
    public static final String FILE_ORDER = "src/CaseStudy/Task03/Data/Order.csv";
    public static final String FILE_CUSTOMER = "src/CaseStudy/Task03/Data/Customer.csv";

    public void Menu() throws ParseException {

        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        ChildrenToyController toyController = new ChildrenToyController();
        SchoolSuppliesController schoolController = new SchoolSuppliesController();
        ProductController productController = new ProductController();
        OrderController orderController = new OrderController();

        while (true) {

            System.out.println("Please choose:");
            System.out.println("1: Insert product");
            System.out.println("2: Insert order");
            System.out.println("3: Show information products");
            System.out.println("4: Show information orders");
            System.out.println("5: Search products: ");
            System.out.println("6: Back to menu");
            System.out.println("7: To exit:");

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
                            System.out.println("Enter unit: ");
                            Long unit = scanner.nextLong();
                            System.out.println("Enter category: ");
                            scanner.nextLine();
                            String category = scanner.nextLine();
                            System.out.println("Enter publish year: ");
                            Integer publishYear = scanner.nextInt();
                            System.out.println("Enter publisher: ");
                            scanner.nextLine();
                            String publisher = scanner.nextLine();
                            System.out.println("Enter author: ");
                            String author = scanner.nextLine();
                            System.out.println("Enter publish date: ");
                            String publishDate = scanner.nextLine();
                            System.out.println("Enter reprints: ");
                            String reprints = scanner.nextLine();

                            //Transfer String into date for publish date
                            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(publishDate);

                            //Insert data into DB
                            Book listBooks = new Book(productID, productName, quantity, unit, category, publishYear, publisher, author, date, reprints);
                            bookController.addBook(listBooks);
                            System.out.println("Insert data successfully!");

                            //Import data into file csv
                            Book_File.writeFile(FILE_BOOK, bookController.getListBook());
                            //Read file from Book.csv
                            Book_File.readFile(FILE_BOOK);

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
                            scanner.nextLine();
                            String categoryOfToy = scanner.nextLine();
                            System.out.println("Enter origin of children toy: ");
                            String originOfToy = scanner.nextLine();
                            System.out.println("Enter brand of book: ");
                            String brandOfToy = scanner.nextLine();
                            System.out.println("Enter supplier of toy: ");
                            String supplierOfToy = scanner.nextLine();
                            System.out.println("Enter user manual of toy: ");
                            String userManualOfToy = scanner.nextLine();

                            //Insert data into DB
                            ChildrenToy listToys = new ChildrenToy(toyID, toyName, quantityOfToy, unitOfToy, categoryOfToy, originOfToy, brandOfToy, supplierOfToy, userManualOfToy);
                            toyController.addChildrenToy(listToys);
                            System.out.println("Insert data successfully!");

                            //Import data into file csv
                            ChildrenToy_File.writeFile(FILE_CHILDRENTOY, toyController.getListToy());
                            //Read file
                            ChildrenToy_File.readFile(FILE_CHILDRENTOY);

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
                            scanner.nextLine();
                            String categoryOfSchool = scanner.nextLine();
                            System.out.println("Enter origin of school supplies: ");
                            String originOfSchool = scanner.nextLine();
                            System.out.println("Enter brand of School supplies: ");
                            String brandOfSchool = scanner.nextLine();
                            System.out.println("Enter supplier of school supplies: ");
                            String supplierOfSchool = scanner.nextLine();
                            System.out.println("Enter user manual of school supplies: ");
                            String userManualOfSchool = scanner.nextLine();
                            System.out.println("Enter color of school supplies: ");
                            String colorlOfSchool = scanner.nextLine();
                            System.out.println("Enter material of school supplies: ");
                            String materialOfSchool = scanner.nextLine();
                            System.out.println("Enter size of school supplies: ");
                            String sizeOfSchool = scanner.nextLine();

                            //Insert data into DB
                            SchoolSupplies listSchools = new SchoolSupplies(schoolSuppliesID, schoolName, quantityOfSchool, unitOfSchool, categoryOfSchool, originOfSchool, brandOfSchool, supplierOfSchool
                                    , userManualOfSchool, colorlOfSchool, materialOfSchool, sizeOfSchool);
                            schoolController.addSchool(listSchools);
                            System.out.println("Insert data successfully!");

                            //Import data into file csv
                            SchoolSupplies_File.writeFile(FILE_SCHOOLSUPPLIES, schoolController.getListSchools());
                            //Read file
                            SchoolSupplies_File.readFile(FILE_SCHOOLSUPPLIES);
                            break;

                        default:
                            System.out.println("Input invalid!");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("Enter order id:");
                    String orderId = scanner.nextLine();
                    System.out.println("Enter customer id:");
                    String customerid = scanner.nextLine();
                    System.out.println("Enter product id:");
                    String productId = scanner.nextLine();
                    System.out.println("Enter quantity:");
                    Integer quantity = scanner.nextInt();

                    //Transfer input String into date for DateBuy
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDateTime dateBuy = LocalDateTime.now();

                    //Insert data into DB
                    Order listOrders = new Order(orderId, customerid, productId, quantity, dateBuy);
                    orderController.addOrder(listOrders);
                    System.out.println("Insert data successfully!");

                    //Import data into file csv
                    Order_File.writeFile(FILE_ORDER, orderController.getListOrders());
                    //Read file
                    Order_File.readFile(FILE_ORDER);
                    System.out.println("Import data successfully");
                    break;

                case "3":
                    System.out.println("Enter book: Show all information of book ");
                    System.out.println("Enter toy: Show  all information children toy");
                    System.out.println("Enter school: Show all information school supplies");
                    System.out.println("Enter all: Show all information products");

                    String typeShow = scanner.nextLine();

                    switch (typeShow) {

                        case "book":
                            System.out.println("The book information list: ");
                            bookController.showListInformationBook();
                            break;

                        case "toy":
                            System.out.println("The children toy information list: ");
                            toyController.showListInformationToy();
                            break;

                        case "school":
                            System.out.println("The school supplies information list: ");
                            schoolController.showListInformationSchool();
                            break;
                        case "all":
                            System.out.println("All information products: ");
                            productController.showListInformationProduct();
                            break;

                        default:
                            System.out.println("No data");
                            break;
                    }
                    break;

                case "4":
                    System.out.println("Show information orders:");
                    orderController.showInformationOrder();
                    break;

                case "5":
                    System.out.println("Enter book: Search book by name");
                    System.out.println("Enter toy: Search children toy by name");
                    System.out.println("Enter school: Search school supplies by name");
                    System.out.println("Enter id: Search product by id");
                    String typeSearch = scanner.nextLine();

                    switch (typeSearch) {

                        case "book":
                            System.out.println("Enter name of book to search: ");
                            String inputSearch = scanner.nextLine();
                            bookController.searchBookByName(inputSearch).forEach(book -> System.out.println(book.toString()));
                            break;

                        case "toy":
                            System.out.println("Enter name of children toy to search: ");
                            String inputSearchOfToy = scanner.nextLine();
                            toyController.searchToyByName(inputSearchOfToy).forEach(childrenToy -> System.out.println(childrenToy.toString()));
                            break;

                        case "school":
                            System.out.println("Enter name of school supplies to search: ");
                            String inputSearchOfSchool = scanner.nextLine();
                            schoolController.searchSchoolByName(inputSearchOfSchool).forEach(schoolSupplies -> System.out.println(schoolSupplies.toString()));
                            break;

                        case "id":
                            System.out.println("Enter product id to search: ");
                            String inputSearchById = scanner.nextLine();
                            productController.searchProductByID(inputSearchById).forEach(products -> System.out.println(products.toString()));
                            break;

                        default:
                            System.out.println("No data");
                    }
                    break;

                case "6":
                    continue;

                case "7":
                    return;

                default:
                    System.out.println("Invalid input!");
                    break;
            }

        }
    }

}
