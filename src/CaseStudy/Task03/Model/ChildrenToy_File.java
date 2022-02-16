package CaseStudy.Task03.Model;

import CaseStudy.Task01.ChildrenToy;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class ChildrenToy_File {
    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<ChildrenToy> listToy) {

        String line = null;
        //INPUT
        for (ChildrenToy listToys : listToy) {
            line = listToys.getProductId() + COMMA + listToys.getProductName() + COMMA + listToys.getQuantity() + COMMA + listToys.getUnit()
                    + COMMA + listToys.getCategoryName() + COMMA+ listToys.getSupplier() + COMMA  + listToys.getBrand()
                    + COMMA + listToys.getOrigin() + COMMA + listToys.getUserManual();

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
