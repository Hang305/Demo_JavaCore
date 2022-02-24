package CaseStudy.Task03.Model;


import CaseStudy.Task01.Book;
import CaseStudy.Task03.Common.Read_Write;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


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
    public static List<Book> readFile(String pathFile) {

        //OUTPUT
        List<Book> result = new ArrayList<>();
        try {
            File file = new File(pathFile);
            Scanner readerToFile = new Scanner(file);
            while (readerToFile.hasNextLine()) {
                String data = readerToFile.nextLine();
                System.out.println(data);

            }
            readerToFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return result;

    }
    public static List getAddressInfor(String line) {
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == '\"') {
                if (str.length() > 0 && stack.size() % 2 == 0)
                    str.append(ch);
                stack.push(ch);
            } else if (ch == ',' && stack.size() % 2 == 0) {
                result.add(str.toString());
                stack.clear();
                str = new StringBuilder();
            } else if (ch == ',' && stack.size() % 2 != 0) {
                str.append(ch);
            } else {
                str.append(ch);
            }
        }
        result.add(str.toString());
        return result;

    }
}
