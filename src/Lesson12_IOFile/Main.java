package Lesson12_IOFile;

import Lesson12_IOFile.Model.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String  FILE_NAME ="src/Lesson12_IOFile/Data/students.csv";

    public static final String COMMA = ",";


    public static void main(String[] args) throws IOException {

        Students student1 = new Students(1, "Thanh Hang","30/05/2000");
        Students student2 = new Students(2, "Thanh Huyen","10/02/1999");
        Students student3 = new Students(3, "Thanh Hai","27/02/1993");

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        //INPUT
//        String line = null;
//
//        for(Students student: students){
//            line = student.getId() + COMMA + student.getName() +COMMA +student.getDateOfBirth();
//
//            FileCommon_IO.writeFile(FILE_NAME,line);
//
//        }

        //OUTPUT
        List<String> listLine = FileCommon_IO.readFile(FILE_NAME);
        System.out.println(listLine);

        //Get a line
        String[] listSplit = listLine.get(0).split(COMMA);
        Students studens1 = new Students(Integer.parseInt(listSplit[0]), listSplit[1],listSplit[2]);
        System.out.println(studens1.getId() + " " + studens1.getName() +" " +studens1.getDateOfBirth());






        //true: remain file and add data into the final file.
        //false: default : create a new file and override old file

//        FileWriter fileWriter = new FileWriter("path_file",true);
//
//        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
//        bufferWriter.write("line");


        //Input file
//        FileReader fileReader = new FileReader("path_file");
//
//        BufferedReader bufferReader = new BufferedReader(new FileReader("fileReader"));
//        bufferReader.readLine();
    }
}
