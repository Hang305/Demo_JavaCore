package CaseStudy.Task03.Model;

import CaseStudy.Task01.ChildrenToy;
import CaseStudy.Task03.Common.Read_Write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
            while ((line = bufferedReader1.readLine()) != null) {
                result = line.split(",");
                String check;
                System.out.println(" ProductID: " + result[0] + "\n Product name: " + result[1] + "\n Quantity: " + result[2] + "\n Unit: " + result[3] +
                        "\n Category name: " + result[4] + "\n Origin: " + result[5] + "\n Brand: " + result[6] + "\n Supplier: " + result[7] +
                        "\n User manual: " + result[8]);

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
