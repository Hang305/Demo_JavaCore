package CaseStudy.Task03.Model;

import CaseStudy.Task01.Customer;
import CaseStudy.Task03.Common.Read_Write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CustomerFile {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<Customer> customer) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader);
            String line = "";
            String[] result;
            while ((line = bufferedReader1.readLine()) != null) {
                result = line.split(",");
                String check;
                System.out.println(" Customer ID: " + result[0] + "\n Full name: " + result[1] + "\n Phone number: " + result[2] + "\n Email: " +result[3]+
                "\n Birthday: " +result[4] + "\n Customer type: " + result[5] );

                System.out.println("-----------------");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Not file found!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
