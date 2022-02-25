package CaseStudy.Task03.Model;


import CaseStudy.Task01.Order;
import CaseStudy.Task03.Common.Read_Write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderFile {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<Order> order) {

        String line = null;
        //INPUT
        for (Order listBills : order) {
            line = listBills.getOrderId() + COMMA + listBills.getCustomerId() + COMMA + listBills.getProductId() + COMMA + listBills.getBuyDate()
                    + COMMA + listBills.getUnit() + COMMA+ listBills.getQuantityBuy() + COMMA+ listBills.getTotal();

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
                List<String> items = Arrays.asList(line.split(","));
                Order listOrder = new Order();
                listOrder.showInformation(items );
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
