package CaseStudy.Task03.Model;

import CaseStudy.Task01.Book;
import CaseStudy.Task01.ChildrenToy;
import CaseStudy.Task03.Common.Read_Write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChildrenToyFile {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<ChildrenToy> listToy) {

        String line = null;
        //INPUT
        for (ChildrenToy listToys : listToy) {
            line = listToys.getProductId() + COMMA + listToys.getProductName() + COMMA + listToys.getQuantity() + COMMA + listToys.getUnit()
                    + COMMA + listToys.getCategoryName() + COMMA + listToys.getSupplier() + COMMA + listToys.getBrand()
                    + COMMA + listToys.getOrigin() + COMMA + listToys.getUserManual();

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
            System.out.format("%-20s%-20s%-20s%-20s%-25s%-20s%-20s%-20s%-20s\n", "Product id", "Product name", "Quantity", "Unit", "Category name",
                    "Origin", "Brand", "Supplier", "User manual");

            while ((line = bufferedReader1.readLine()) != null) {
                result = line.split(",");

                System.out.format("%-20s%-20s%-20s%-20s%-25s%-20s%-20s%-20s%-20s\n", result[0],result[1] , result[2] , result[3] ,
                        result[4] ,result[5] , result[6] , result[7] , result[8]);

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
