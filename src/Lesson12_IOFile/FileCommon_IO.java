package Lesson12_IOFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCommon_IO {

    //Input
    public static void writeFile(String pathFile, String line){

        File file;
        try {
            FileWriter fileWrite = new FileWriter(pathFile, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
            bufferedWriter.write(line);
            bufferedWriter.newLine();

            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Output
    public static List<String> readFile(String pathFile){
        List<String> listLine = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);

            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            BufferedReader bufferedReader1 = new BufferedReader(fileReader);

            String line = null;

             while ((line = bufferedReader1.readLine()) != null){
                listLine.add(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listLine;
    }

    public static void main(String[] args) {

    }
}
