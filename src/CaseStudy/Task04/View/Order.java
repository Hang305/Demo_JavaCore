package CaseStudy.Task04.View;

import CaseStudy.Task02.Control.OrderController;
import CaseStudy.Task02.Control.ProductController;
import CaseStudy.Task03.Model.BookFile;
import CaseStudy.Task03.Model.OrderFile;
import CaseStudy.Task04.Validate.ValidateProductId;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Order {

    Integer quantity;
    String productId;
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_ORDER = "src/CaseStudy/Task03/Data/Order.csv";
    public static final String REGEX_EMAIL = "^\\w+@+\\w+(\\.\\w+){1,2}$";
    public static final String REGEX_ORDERID = "^\\DH+-+\\d{4}$";
    OrderController orderController = new OrderController();
    public void showInformation() {
        System.out.println("Show information orders:");

        //Read file from Book.csv
        List<String> listOrder = OrderFile.readFile(FILE_ORDER);
        orderController.showInformationOrder(listOrder);

    }

    public void insertOrder() {

        //Validate order id
        System.out.println("Enter order id:");
        String orderId = scanner.nextLine();
        while (!orderId.matches(REGEX_ORDERID)) {
            System.out.println("Input invalid. Enter order id again: ");
            orderId = scanner.nextLine();
        }

        //Import customer id
        System.out.println("Enter customer id:");
        String customerid = scanner.nextLine();

        //Validate product name
        ValidateProductId productid = new ValidateProductId();
        productId = productid.validateProductId();

        //Validate quantity buy
        do {
            System.out.println("Enter quantity with the positive number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input invalid! Enter quantity again: ");
                scanner.next();
            }
            quantity = scanner.nextInt();
        } while (quantity <= 0);

        //Transfer input String into date for DateBuy
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime dateBuy = LocalDateTime.now();
        String date = dtf.format(dateBuy);

        //Insert data into DB
        CaseStudy.Task01.Order listOrders = new CaseStudy.Task01.Order(orderId, customerid, productId, quantity, date);
        orderController.addOrder(listOrders);
        System.out.println("Insert data successfully!");

        //Import data into file csv
        OrderFile.writeFile(FILE_ORDER, orderController.getListOrders());
        //Read file
        OrderFile.readFile(FILE_ORDER);
        System.out.println("Import data successfully");
    }
}
