package CaseStudy.Task04.View;

import CaseStudy.Task02.Control.CustomerController;
import CaseStudy.Task03.Model.CustomerFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer {

    public static final String REGEX_EMAIL = "^\\w+@+\\w+(\\.\\w+){1,2}$";
    public static final String REGEX_PHONE_NUMBER = "^\\d{12}$";

    public static final String FILE_CUSTOMER = "src/CaseStudy/Task03/Data/Customer.csv";

    String numberPhone,dateOfBirth;
    long age;
    Date today = new Date();
    long yearCurrent = today.getYear() + 1900;
    Scanner scanner = new Scanner(System.in);
    CustomerController customerController = new CustomerController();

    public void addCustomer(){
        //Import customer id on file
        System.out.println("Enter Customer id:");
        String customerId = scanner.nextLine();

        //Import full name on file
        System.out.println("Enter full name:");
        String fullName = scanner.nextLine();

        //Validate the number phone
        System.out.println("Enter number phone:");
        numberPhone = scanner.nextLine();
        do {
            while (!numberPhone.matches(REGEX_PHONE_NUMBER)) {
                System.out.println("Input invalid with 12 numbers. Enter number phone again: ");
                numberPhone = scanner.nextLine();
            }
            break;
        } while (true);

        //Validate email
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        while (true) {
            while (!email.matches(REGEX_EMAIL)) {
                System.out.println("Input invalid! Enter email again: ");
                email = scanner.nextLine();
            }
            break;
        }

        //Validate birthday
        //parse() convert from String to Date
        //format() convert LocalDate object to String.
        String[] yearOfBirth;
        Date birthday;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter birthday with format dd/MM/yyyy and age must be greater than 16 years old: ");
//                    dateOfBirth = scanner.nextLine();
        df.setLenient(false);
        boolean checkDate;
        do {
            try {
                checkDate = true;
                birthday = df.parse(scanner.nextLine());
                while (age < 16 || age <= 0) {
                    System.out.println("Birthday must be greater than 16 years old. Please enter birthday again: ");
                    dateOfBirth = scanner.nextLine();

                    yearOfBirth = dateOfBirth.split("/", 3);
                    age = yearCurrent - Long.parseLong(yearOfBirth[2]);
                    dateOfBirth = df.format(birthday);
                }
            } catch (ParseException ex) {
                System.out.println("Input invalid format dd/MM/yyyy. Please enter birthday again: ");
                checkDate = false;
            }
        } while (!checkDate);

        //Import customer type
//                    System.out.println("Enter customer type:");
//                    String customerType = scanner.nextLine();
        String customerType = "Normal";

        CaseStudy.Task01.Customer customer = new CaseStudy.Task01.Customer(customerId, fullName, numberPhone, email, dateOfBirth, customerType);
        customerController.addCustomer(customer);
        System.out.println("Insert data successfully!");
        customerController.showListInformationCustomer();

        //Import data into file csv
        CustomerFile.writeFile(FILE_CUSTOMER, customerController.getListCustomers());
        //Read file
        CustomerFile.readFile(FILE_CUSTOMER);
    }
}
