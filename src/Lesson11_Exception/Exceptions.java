package Lesson11_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions extends Throwable {

    public static void main(String[] args) {

        //Exception uncheck - Runtime Exception
//        int zero = 0;
//        System.out.println(10 / zero);
    }

    //Exception - Check
    public Exceptions() throws FileNotFoundException {

    }

    File file;
    FileReader f = new FileReader(file);

    //error - Stack over flow error - Vùng nhớ bị tràn
    public static void print() {
        print(); // there's no stopping
    }

    //Handling Exception

    public static void throwsException() throws FileNotFoundException {
        FileReader f1 = new FileReader("filename.json");
    }

    //Using Try-Catch
    public static void usingTry() {

        try{
            int zero = 0;
            System.out.println(10 / zero);

        }catch(Exception ex){

            System.out.println(ex.getMessage());
        }//Dù có exception hay không (có lỗi hay không có lỗi) đều thực hiện finally
        finally{
            System.out.println("finally");
        }


    }
}
