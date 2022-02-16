package CaseStudy.Task03.Model;


import CaseStudy.Task01.Bill;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class Bill_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<Bill> bill) {

        String line = null;

        //INPUT
        for (Bill listBills : bill) {
            line = listBills.getBillId() + COMMA + listBills.getCustomerId() + COMMA + listBills.getProductId() + COMMA + listBills.getBuyDate()
                    + COMMA + listBills.getUnit() + COMMA+ listBills.getQuantity() + COMMA+ listBills.getTotal();

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
