package CaseStudy.Task04.View;

import CaseStudy.Task02.Control.OrderController;
import CaseStudy.Task03.Model.BookFile;
import CaseStudy.Task03.Model.OrderFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Order {

    Integer quantity, reprints;
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_ORDER = "src/CaseStudy/Task03/Data/Order.csv";
    OrderController orderController = new OrderController();

    public void showInformation(){
        System.out.println("Show information orders:");
//        orderController.showInformationOrder();
        //Read file from Book.csv
        OrderFile.readFile(FILE_ORDER);
    }

    public void insertOrder(){
        System.out.println("Enter order id:");
        String orderId = scanner.nextLine();
        System.out.println("Enter customer id:");
        String customerid = scanner.nextLine();
        System.out.println("Enter product id:");
        String productId = scanner.nextLine();
        //Import reprints on file and validate field
        do {
            System.out.println("Enter quantity with the positive number: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Input invalid! Enter quantity again: ");
                scanner.next();
            }
            quantity = scanner.nextInt();
        } while (reprints <= 0);

        //Transfer input String into date for DateBuy
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime dateBuy = LocalDateTime.now();

        //Insert data into DB
        CaseStudy.Task01.Order listOrders = new CaseStudy.Task01.Order(orderId, customerid, productId, quantity, dateBuy);
        orderController.addOrder(listOrders);
        System.out.println("Insert data successfully!");

        //Import data into file csv
        OrderFile.writeFile(FILE_ORDER, orderController.getListOrders());
        //Read file
        OrderFile.readFile(FILE_ORDER);
        System.out.println("Import data successfully");
    }
}
