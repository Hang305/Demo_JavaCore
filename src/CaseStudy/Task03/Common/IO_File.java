package CaseStudy.Task03.Common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IO_File {

    public static final String FIlE_SACH ="src/CaseStudy/Task03/Data/Sach.csv";

    public static void CreateFile(){
        // Create file
        try{
            File f = new File(FIlE_SACH);

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
    public static void WriteToFile(){
        //WriteToFile
        try{
            File file;
            FileWriter writetofile = new FileWriter(FIlE_SACH);
            writetofile.write("Hello world!");

            writetofile.close();
            System.out.println("Successfully wrote to the file.");

        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Read file
    public static void ReadFile(){

        try{
            File file = new File(FIlE_SACH);
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
    public static void GetInformationFile(){
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
    }

    //Delete file
    public static void DeleteFile(){

        File deleteFile = new File("filename.txt");
        if(deleteFile.delete()){
            System.out.println("Delete the file: "+ deleteFile.getName());
        }
        else{
            System.out.println("Failed to delete the file.");
        }
    }
}
