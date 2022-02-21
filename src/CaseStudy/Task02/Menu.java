package CaseStudy.Task02;

import CaseStudy.Task01.*;
import CaseStudy.Task02.Control.*;
import CaseStudy.Task03.Model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.*;

public class Menu {

    public static final String FILE_BOOK = "src/CaseStudy/Task03/Data/Book.csv";
    public static final String FILE_SCHOOLSUPPLIES = "src/CaseStudy/Task03/Data/SchoolSupplies.csv";
    public static final String FILE_CHILDRENTOY = "src/CaseStudy/Task03/Data/ChildrenToy.csv";
    public static final String FILE_ORDER = "src/CaseStudy/Task03/Data/Order.csv";
    public static final String FILE_CUSTOMER = "src/CaseStudy/Task03/Data/Customer.csv";

    //Email
    public static final String REGEX_EMAIL ="^\\w+@+\\w+(\\.\\w+){1,2}$";
    //Phone
    public static final String REGEX_PHONE_NUMBER ="^84\\d{10}$";
    //Date
    public static final String REGEX_DATE ="/\\b([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))\\b/gm";
    Matcher  matcher;

    public void Menu() throws ParseException {

        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();

        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        ChildrenToyController toyController = new ChildrenToyController();
        SchoolSuppliesController schoolController = new SchoolSuppliesController();
        ProductController productController = new ProductController();
        OrderController orderController = new OrderController();
        CustomerController customerController = new CustomerController();

        while (true) {

            //Menu
            System.out.println("Please choose:");
            System.out.println("1: Insert product");
            System.out.println("2: Insert order");
            System.out.println("3: Insert customer");
            System.out.println("4: Show information products");
            System.out.println("5: Show information orders");
            System.out.println("6: Search products: ");
            System.out.println("7: Back to menu");
            System.out.println("8: To exit:");

            String line = scanner.nextLine();

            switch (line) {

                //Insert products
                case "1":
                    System.out.println("Enter book: to insert book");
                    System.out.println("Enter toy: to insert children toy");
                    System.out.println("Enter school: to insert school supplies");

                    String type = scanner.nextLine();

                    switch (type) {

                        //Insert book
                        case "book":
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

                            String categoryBook = "";
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
                            Integer publishYear = null;
                            do {
                                System.out.println("Enter publish year: ");
                                while(!scanner.hasNextInt()){
                                    System.out.println("Input invalid! Please enter publish year as the number: ");
                                    scanner.next();
                                }
                                publishYear = scanner.nextInt();

                            } while (publishYear <= 1000 || publishYear >= 2022);

                            System.out.println("Enter publisher: ");
                            scanner.nextLine();
                            String publisher = scanner.nextLine();
                            System.out.println("Enter author: ");
                            String author = scanner.nextLine();
                            System.out.println("Enter publish date: ");
                            String publishDate = scanner.nextLine();

                            int reprints;
                            do {
                                System.out.println("Enter reprints:");
                                reprints = scanner.nextInt();
                            }
                            while (reprints <= 0);
                            //Transfer String into date for publish date
                            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(publishDate);

                            //Insert data into DB
                            Book listBooks = new Book(productID, productName, quantity, unit, categoryBook, publishYear, publisher, author, date, reprints);
                            bookController.addBook(listBooks);
                            System.out.println("Insert data successfully!");

                            //Import data into file csv
                            BookFile.writeFile(FILE_BOOK, bookController.getListBook());
                            //Read file from Book.csv
                            BookFile.readFile(FILE_BOOK);

                            break;

                        //Import children toy
                        case "toy":
                            System.out.println("Enter children Id: ");
                            String toyID = scanner.nextLine();
                            System.out.println("Enter children name: ");
                            String toyName = scanner.nextLine();
                            System.out.println("Enter quantity: ");
                            int quantityOfToy = scanner.nextInt();
                            System.out.println("Enter unit of book: ");
                            Long unitOfToy = scanner.nextLong();

                            System.out.println("Please choose a category: ");
                            System.out.println("\t 1: Group 0-3 years age");
                            System.out.println("\t 2: Group 4-8 years age");
                            System.out.println("\t 3: Group over 8 years age");
                            scanner.nextLine();
                            String indexCategoryToy = scanner.nextLine();

                            String categoryToy = "";
                            switch (indexCategoryToy) {
                                case "1":
                                    categoryToy = "Group 0-3 years age";
                                    break;
                                case "2":
                                    categoryToy = "Group 4-8 years age";
                                    break;
                                case "3":
                                    categoryToy = "Group over 8 years age";
                                    break;
                                default:
                                    System.out.println("Input invalid!");
                                    break;
                            }

                            System.out.println("Enter origin of children toy: ");
                            String originOfToy = scanner.nextLine();
                            System.out.println("Enter brand of book: ");
                            String brandOfToy = scanner.nextLine();
                            System.out.println("Enter supplier of toy: ");
                            String supplierOfToy = scanner.nextLine();
                            System.out.println("Enter user manual of toy: ");
                            String userManualOfToy = scanner.nextLine();

                            //Insert data into DB
                            ChildrenToy listToys = new ChildrenToy(toyID, toyName, quantityOfToy, unitOfToy, categoryToy, originOfToy, brandOfToy, supplierOfToy, userManualOfToy);
                            toyController.addChildrenToy(listToys);
                            System.out.println("Insert data successfully!");

                            //Import data into file csv
                            ChildrenToyFile.writeFile(FILE_CHILDRENTOY, toyController.getListToy());
                            //Read file
                            ChildrenToyFile.readFile(FILE_CHILDRENTOY);

                            break;

                        //Insert school supplies
                        case "school":
                            System.out.println("Enter school supplies Id: ");
                            String schoolSuppliesID = scanner.nextLine();
                            System.out.println("Enter school supplies name: ");
                            String schoolName = scanner.nextLine();
                            System.out.println("Enter quantity: ");
                            int quantityOfSchool = scanner.nextInt();
                            System.out.println("Enter unit of School: ");
                            Long unitOfSchool = scanner.nextLong();

                            System.out.println("Please choose a category: ");
                            System.out.println("\t 1: The primary school");
                            System.out.println("\t 2: The junior high school");
                            System.out.println("\t 3: The high school");
                            scanner.nextLine();
                            String indexCategorySchool = scanner.nextLine();

                            String categorySchool = "";
                            switch (indexCategorySchool) {
                                case "1":
                                    categorySchool = "The primary school";
                                    break;
                                case "2":
                                    categorySchool = "The junior high school";
                                    break;
                                case "3":
                                    categorySchool = "The high school";
                                    break;
                                default:
                                    System.out.println("Input invalid!");
                                    break;
                            }
                            System.out.println("Enter origin of school supplies: ");
                            String originOfSchool = scanner.nextLine();
                            System.out.println("Enter brand of School supplies: ");
                            String brandOfSchool = scanner.nextLine();
                            System.out.println("Enter supplier of school supplies: ");
                            String supplierOfSchool = scanner.nextLine();
                            System.out.println("Enter user manual of school supplies: ");
                            String userManualOfSchool = scanner.nextLine();
                            System.out.println("Enter color of school supplies: ");

                            System.out.println("Please choose the color: ");
                            System.out.println("\t 1: Blue");
                            System.out.println("\t 2: Red");
                            System.out.println("\t 3: Yellow");
                            System.out.println("\t 4: Black");
                            System.out.println("\t 5: White");

                            String indexColor = scanner.nextLine();
                            String color = "";
                            switch (indexColor) {
                                case "1":
                                    color = "Blue";
                                    break;
                                case "2":
                                    color = "Red";
                                    break;
                                case "3":
                                    color = "Yellow";
                                    break;
                                case "4":
                                    color = "Black";
                                    break;
                                case "5":
                                    color = "White";
                                    break;
                                default:
                                    System.out.println("Input invalid!");
                                    break;
                            }
                            System.out.println("Enter material of school supplies: ");
                            String materialOfSchool = scanner.nextLine();

                            double size = 0.0f;
                            do {
                                System.out.println("Enter size of school supplies: ");
                                size = scanner.nextDouble();
                            } while (size <= 0.0f);

                            //Insert data into DB
                            SchoolSupplies listSchools = new SchoolSupplies(schoolSuppliesID, schoolName, quantityOfSchool, unitOfSchool, categorySchool, originOfSchool, brandOfSchool, supplierOfSchool
                                    , userManualOfSchool, color, materialOfSchool, size);
                            schoolController.addSchool(listSchools);
                            System.out.println("Insert data successfully!");

                            //Import data into file csv
                            SchoolSuppliesFile.writeFile(FILE_SCHOOLSUPPLIES, schoolController.getListSchools());
                            //Read file
                            SchoolSuppliesFile.readFile(FILE_SCHOOLSUPPLIES);
                            break;

                        default:
                            System.out.println("Input invalid!");
                            break;
                    }
                    break;

                //Insert order
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
                    OrderFile.writeFile(FILE_ORDER, orderController.getListOrders());
                    //Read file
                    OrderFile.readFile(FILE_ORDER);
                    System.out.println("Import data successfully");
                    break;

                //Insert customer
                case "3":
                    System.out.println("Enter Customer id:");
                    String customerId = scanner.nextLine();
                    System.out.println("Enter full name:");
                    String fullName = scanner.nextLine();

                    //Validate input for number phone
                    String numberPhone;
                    do {
                        System.out.println("Enter number phone:");
                         numberPhone = scanner.nextLine();
                        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
                        matcher = pattern.matcher(numberPhone);

                    }while(matcher.matches() == false);

                    String email;
                    do {
                        System.out.println("Enter email:");
                        email = scanner.nextLine();
                        Pattern pattern = Pattern.compile(REGEX_EMAIL);
                        matcher = pattern.matcher(email);
                    }while(matcher.matches() == false);
                    String birthDate;

                    do {
                        System.out.println("Enter birth date:");
                        birthDate = scanner.nextLine();
                        Pattern pattern = Pattern.compile(REGEX_DATE);
                        matcher = pattern.matcher(birthDate);
                    }while (matcher.matches() == false );

                    System.out.println("Enter customer type:");
                    String customerType = scanner.nextLine();

                    //Transfer String into date for publish date
                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);

                    Customer customer = new Customer(customerId, fullName, numberPhone, email, date, customerType);
                    customerController.addCustomer(customer);
                    System.out.println("Insert data successfully!");

                    //Import data into file csv
                    CustomerFile.writeFile(FILE_CUSTOMER, customerController.getListCustomers());
                    //Read file
                    CustomerFile.readFile(FILE_CUSTOMER);
                    break;

                //Show information products
                case "4":
                    System.out.println("Enter book: Show all information of book ");
                    System.out.println("Enter toy: Show  all information children toy");
                    System.out.println("Enter school: Show all information school supplies");
                    System.out.println("Enter all: Show all information products");

                    String typeShow = scanner.nextLine();

                    switch (typeShow) {

                        //Show information for book
                        case "book":
                            System.out.println("The book information list: ");
                            bookController.showListInformationBook();
                            break;

                        //Show information for children toy
                        case "toy":
                            System.out.println("The children toy information list: ");
                            toyController.showListInformationToy();
                            break;

                        //Show information for School supplies
                        case "school":
                            System.out.println("The school supplies information list: ");
                            schoolController.showListInformationSchool();
                            break;

                        //Show information for products
                        case "all":
                            System.out.println("All information products: ");
                            productController.showListInformationProduct();
                            break;

                        default:
                            System.out.println("No data");
                            break;
                    }
                    break;

                //Show information for orders products
                case "5":
                    System.out.println("Show information orders:");
                    orderController.showInformationOrder();
                    break;

                //Search products by name
                case "6":
                    System.out.println("Enter book: Search book by name");
                    System.out.println("Enter toy: Search children toy by name");
                    System.out.println("Enter school: Search school supplies by name");
                    System.out.println("Enter id: Search product by id");
                    String typeSearch = scanner.nextLine();

                    switch (typeSearch) {

                        //Search books by name
                        case "book":
                            System.out.println("Enter name of book to search: ");
                            String inputSearch = scanner.nextLine();
                            bookController.searchBookByName(inputSearch).forEach(book -> System.out.println(book.toString()));
                            break;

                        //Search children toy by name
                        case "toy":
                            System.out.println("Enter name of children toy to search: ");
                            String inputSearchOfToy = scanner.nextLine();
                            toyController.searchToyByName(inputSearchOfToy).forEach(childrenToy -> System.out.println(childrenToy.toString()));
                            break;

                        //Search school supplies by name
                        case "school":
                            System.out.println("Enter name of school supplies to search: ");
                            String inputSearchOfSchool = scanner.nextLine();
                            schoolController.searchSchoolByName(inputSearchOfSchool).forEach(schoolSupplies -> System.out.println(schoolSupplies.toString()));
                            break;

                        //Search products by id
                        case "id":
                            System.out.println("Enter product id to search: ");
                            String inputSearchById = scanner.nextLine();
                            productController.searchProductByID(inputSearchById).forEach(products -> System.out.println(products.toString()));
                            break;

                        default:
                            System.out.println("No data");
                    }
                    break;

                // Back to menu
                case "7":
                    continue;

                    //Exit
                case "8":
                    return;

                default:
                    throw new IllegalStateException("Unexpected value: " + line);
            }

        }
    }

}
