package CaseStudy.Task03.Model;


import CaseStudy.Task01.Order;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class Order_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<Order> order) {

        String line = null;

        //INPUT
        for (Order listBills : order) {
            line = listBills.getOrderId() + COMMA + listBills.getCustomerId() + COMMA + listBills.getProductId() + COMMA + listBills.getBuyDate()
                    + COMMA + listBills.getUnit() + COMMA+ listBills.getQuantityBuy() + COMMA+ listBills.getTotal();

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
