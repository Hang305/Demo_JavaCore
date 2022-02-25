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
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
