package CaseStudy.Task03.Model;


import CaseStudy.Task01.Book;
import CaseStudy.Task03.Common.Read_Write;

import java.util.List;


public class Book_File {

    public static final String COMMA = ", ";

    public static void writeFile(String pathFile, List<Book>listBooks) {

        String line = null;
        //INPUT
        for (Book listSach :listBooks ) {
            line = listSach.getProductId() + COMMA + listSach.getProductName() + COMMA + listSach.getQuantity() + COMMA + listSach.getUnit() + COMMA + listSach.getCategoryName() + COMMA
                    + listSach.getPublisher() + COMMA  + listSach.getReprints() + COMMA + listSach.getAuthor() + COMMA + listSach.getPublishDate() + COMMA + listSach.getPublishYear();

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
