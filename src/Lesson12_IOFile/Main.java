package Lesson12_IOFile;

import Lesson12_IOFile.Model.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String  FILE_NAME ="src/Lesson12_IOFile/Data/students.csv";

    public static final String COMMA = ",";


    public static void main(String[] args) throws IOException {

//        Students student1 = new Students(1, "Thanh Hang","30/05/2000");
//        Students student2 = new Students(2, "Thanh Huyen","10/02/1999");
//        Students student3 = new Students(3, "Thanh Hai","27/02/1993");
//
//        List<Students> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        //INPUT
//        String line = null;
//
//        for(Students student: students){
//            line = student.getId() + COMMA + student.getName() +COMMA +student.getDateOfBirth();
//
//            FileCommon_IO.writeFile(FILE_NAME,line);
//
//        }

        //OUTPUT
//        List<String> listLine = FileCommon_IO.readFile(FILE_NAME);
//        System.out.println(listLine);

        //Get a line
//        String[] listSplit = listLine.get(0).split(COMMA);
//        Students studens1 = new Students(Integer.parseInt(listSplit[0]), listSplit[1],listSplit[2]);
//        System.out.println(studens1.getId() + " " + studens1.getName() +" " +studens1.getDateOfBirth());


        //Create file
//         try{
//             File f = new File("filename.txt");
//
//        if(f.createNewFile()){
//            System.out.println("File create: "+ f.getName());
//
//        }
//        else{
//            System.out.println("File already exists.");
//        }
//         }catch(IOException e){
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }


         //WriteToFile
        try{
            File file;
            FileWriter writetofile = new FileWriter("filename.txt");
            writetofile.write("Hello world!");

            writetofile.close();
            System.out.println("Successfully wrote to the file.");

        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Read file
        try{
            File file = new File("filename.txt");
            Scanner readerToFile = new Scanner(file);

            while(readerToFile.hasNextLine()){
                String data = readerToFile.nextLine();
                System.out.println(data);
            }
            readerToFile.close();
        } catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        //get file information
        File file = new File("filename.txt");
        if(file.exists()){
            System.out.println("File name: " +file.getName());
            System.out.println("Absolute path: "+ file.getAbsolutePath());
            System.out.println("Writeable: "+ file.canWrite());
            System.out.println("Readerable: "+ file.canRead());
            System.out.println("File size in bytes: " +file.length());
        }
        else{
            System.out.println("The file does not exist.");
        }

        //Delete file
//        File deleteFile = new File("filename.txt");
//        if(deleteFile.delete()){
//            System.out.println("Delete the file: "+ deleteFile.getName());
//        }
//        else{
//            System.out.println("Failed to delete the file.");
//        }

    }
}
