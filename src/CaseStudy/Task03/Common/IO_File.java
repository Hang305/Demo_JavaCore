package CaseStudy.Task03.Common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IO_File {

    public static void createFile(String pathFile){
        // Create file
        try{
            File f = new File(pathFile);

            if(f.createNewFile()){
                System.out.println("File create: "+ f.getName());

            }
            else{
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Write to file
    public static void writeToFile(String pathFile){
        //WriteToFile
        try{

            FileWriter writetofile = new FileWriter( pathFile);
            writetofile.write("Hello world!");

            writetofile.close();
            System.out.println("Successfully wrote to the file.");

        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Read file
    public static void readFile(String pathFile){

        try{
            File file = new File( pathFile);
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
    }

    //get file information
    public static void getInformationFile(String pathFile){
        File file = new File( pathFile);
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
    }

    //Delete file
    public static void deleteFile(String pathFile){

        File deleteFile = new File( pathFile);
        if(deleteFile.delete()){
            System.out.println("Delete the file: "+ deleteFile.getName());
        }
        else{
            System.out.println("Failed to delete the file.");
        }
    }
}
