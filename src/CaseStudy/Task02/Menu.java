package CaseStudy.Task02;

import CaseStudy.Task02.Control.*;
import CaseStudy.Task04.View.*;


import java.util.Scanner;

public class Menu {

    public void Menu() {

        Scanner scanner = new Scanner(System.in);
        Book viewBook = new Book();
        ChildrenToy viewToy = new ChildrenToy();
        SchoolSupplies viewSchool = new SchoolSupplies();
        Customer viewCustomer = new Customer();
        Order viewOrder = new Order();
        ProductController productController = new ProductController();

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
                case "1": {
                    System.out.println("Enter book: to insert book");
                    System.out.println("Enter toy: to insert children toy");
                    System.out.println("Enter school: to insert school supplies");

                    String type = scanner.nextLine();

                    switch (type) {

                        //Insert book
                        case "book": {
                            viewBook.insertBook();
                        }
                        break;

                        //Import children toy
                        case "toy": {
                            viewToy.insertToy();
                        }
                        break;

                        //Insert school supplies
                        case "school": {
                            viewSchool.insertSchool();
                        }
                        break;

                        default: {
                            System.out.println("Input invalid!");
                        }
                        break;
                    }
                }
                break;

                //Insert order
                case "2": {
                    viewOrder.insertOrder();
                }
                break;

                //Insert customer
                case "3": {
                    viewCustomer.addCustomer();
                }
                break;

                //Show information products
                case "4": {
                    System.out.println("Enter book: Show all information of book ");
                    System.out.println("Enter toy: Show  all information children toy");
                    System.out.println("Enter school: Show all information school supplies");
//                    System.out.println("Enter all: Show all information products");

                    String typeShow = scanner.nextLine();

                    switch (typeShow) {

                        //Show information for book
                        case "book":
                            viewBook.showInformation();
                            break;

                        //Show information for children toy
                        case "toy":
                            viewToy.showInformation();
                            break;

                        //Show information for School supplies
                        case "school":
                            viewSchool.showInformation();
                            break;

                        default:
                            System.out.println("No data");
                            break;
                    }
                }
                break;

                //Show information for orders products
                case "5": {
                    viewOrder.showInformation();
                }
                break;

                //Search products by name
                case "6": {
                    System.out.println("Enter book: Search book by name");
                    System.out.println("Enter toy: Search children toy by name");
                    System.out.println("Enter school: Search school supplies by name");
                    System.out.println("Enter id: Search product by id");
                    String typeSearch = scanner.nextLine();

                    switch (typeSearch) {

                        //Search books by name
                        case "book":
                            viewBook.searchBookByName();
                            break;

                        //Search children toy by name
                        case "toy":
                            viewToy.searchToyByName();
                            break;

                        //Search school supplies by name
                        case "school":
                            viewSchool.searchSchoolByName();
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
                }
                break;

                // Back to menu
                case "7":
                    continue;

                    //Exit
                case "8":
                    return;
            }
        }
    }
}
