package CaseStudy.Task03.Model;
import CaseStudy.Task01.Book;
import CaseStudy.Task03.Common.Read_Write;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookFile {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<Book> listBooks) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String line = null;
        //INPUT
        for (Book listSach : listBooks) {
            line = listSach.getProductId() + COMMA + listSach.getProductName() + COMMA + listSach.getQuantity() + COMMA + listSach.getUnit() + COMMA + listSach.getCategoryName() + COMMA
                    + listSach.getPublisher() + COMMA + listSach.getReprints() + COMMA + listSach.getAuthor() + COMMA + sdf.format(listSach.getPublishDate()) + COMMA + listSach.getPublishYear();

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
                System.out.println(" Product ID: " + result[0] + "\n Product name: " + result[1] + "\n Quantity: " + result[2] + "\n Unit: " + result[3] +
                        "\n Category name:" + result[4] + "\n Publisher:" + result[5] + "\n Publisher year: " + result[6] + "\n Author: " + result[7] +
                        "\n Publisher date: " + result[8] + "\n Reprints: " + result[9]);

                System.out.println("-----------------");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;

    }
}
