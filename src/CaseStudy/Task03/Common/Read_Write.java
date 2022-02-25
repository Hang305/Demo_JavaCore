package CaseStudy.Task03.Common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read_Write {

    //INPUT
    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWrite = new FileWriter(pathFile, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
            bufferedWriter.write(line);
            bufferedWriter.newLine();

            bufferedWriter.close();
//            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //OUTPUT
    public static List<String> readFile(String pathFile) {
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader);
            String line = "";
            String[] result;
            while ((line = bufferedReader1.readLine()) != null) {
                result = line.split(",");
                String check;
                for(String item : result){
                    System.out.println(item + " ");
                }
//                listLine.add(line);
//                String data = bufferedReader1.readLine();
//                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }

    public static String[] READFILE(String pathFile) {
        String[] result = new String[20];
        try {
            File file = new File(pathFile);
            Scanner readerToFile = new Scanner(file);
            String[][] list;
            while (readerToFile.hasNextLine()) {
//                result = data.split(",");
                String data = readerToFile.nextLine();
                result = data.split(",");
                System.out.println(data);

                for (String item :result
                ) {
                    System.out.println(item);
                }
            }
            readerToFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return result;
    }
}
