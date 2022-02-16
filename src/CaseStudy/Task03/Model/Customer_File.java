package CaseStudy.Task03.Model;

import CaseStudy.Task01.Customer;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class Customer_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<Customer> customer) {

        String line = null;
        //INPUT
        for (Customer listCustomers: customer) {
            line = listCustomers.getCustomerId() + COMMA + listCustomers.getCustomerType() + COMMA + listCustomers.getFullName() + COMMA + listCustomers.getBirthDate()
                    + COMMA + listCustomers.getEmail() + COMMA+ listCustomers.getPhoneNumber();

//            System.out.println(line);
            Read_Write.writeFile(pathFile, line);
        }
    }

    //Output
    public static List<String> readFile(String pathFile) {

        //OUTPUT
        List<String> listLine = Read_Write.readFile(pathFile);
//        System.out.println(listLine);

        return listLine;
    }
}
