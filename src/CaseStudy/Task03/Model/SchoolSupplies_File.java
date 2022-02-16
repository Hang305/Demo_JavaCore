package CaseStudy.Task03.Model;

import CaseStudy.Task01.SchoolSupplies;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;

public class SchoolSupplies_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<SchoolSupplies> schoolSupplies) {

        String line = null;
        //INPUT
        for (SchoolSupplies listCchoolSupplies : schoolSupplies) {
            line = listCchoolSupplies.getProductId() + COMMA + listCchoolSupplies.getProductName() + COMMA + listCchoolSupplies.getQuantity() + COMMA + listCchoolSupplies.getUnit()
                    + COMMA + listCchoolSupplies.getCategoryName() + COMMA+ listCchoolSupplies.getSupplier() + COMMA  + listCchoolSupplies.getBrand()
                    + COMMA + listCchoolSupplies.getOrigin() + COMMA + listCchoolSupplies.getUserManual();

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
