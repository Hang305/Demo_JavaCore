package CaseStudy.Task03.Model;

import CaseStudy.Task01.SchoolSupplies;
import CaseStudy.Task02.Control.SchoolSuppliesController;
import CaseStudy.Task03.Common.Read_Write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SchoolSuppliesFile {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<SchoolSupplies> schoolSupplies) {

        String line = null;
        //INPUT
        for (SchoolSupplies listCchoolSupplies : schoolSupplies) {
            line = listCchoolSupplies.getProductId() + COMMA + listCchoolSupplies.getProductName() + COMMA + listCchoolSupplies.getQuantity() + COMMA + listCchoolSupplies.getUnit()
                    + COMMA + listCchoolSupplies.getCategoryName() + COMMA + listCchoolSupplies.getSupplier() + COMMA + listCchoolSupplies.getBrand()
                    + COMMA + listCchoolSupplies.getOrigin() + COMMA + listCchoolSupplies.getUserManual() + COMMA + listCchoolSupplies.getColor() + COMMA + listCchoolSupplies.getMaterial() + COMMA + listCchoolSupplies.getSize();

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
            System.out.format("%-15s%-15s%-15s%-15s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Product id", "Product name", "Quantity", "Unit", "Category name",
                    "Origin", "Brand", "Supplier", "User manual", "Color", "material", "size");
            while ((line = bufferedReader1.readLine()) != null) {
                List<String> result = new ArrayList<>(Arrays.asList(line.split(",")));
                SchoolSupplies listSchools = new SchoolSupplies();
                listSchools.getInformation(result);

//                for (String item: result){
//                    System.out.println(item);
//                }
//                System.out.println("-----------------");
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
