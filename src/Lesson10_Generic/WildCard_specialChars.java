package Lesson10_Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCard_specialChars {

    public static void main(String[] args) {
        List<Integer> lsInt = new ArrayList<>();

        for(int i =0; i<=5; i++){
            lsInt.add(i);
        }

        List<String> lsString = new ArrayList<>();
        for(int i =0; i<=5; i++){
            lsString.add("item"+i);
        }
        List<Double> lsDouble = new ArrayList<>();
        for(int i =0; i<=5; i++){
            lsDouble.add(i+1.1);
        }

        printElement(lsInt);
        printElement(lsString);
        printElement(lsDouble);


        printElementNumber(lsInt);
//        printElementNumber(lsString);//Compile error
        printElementNumber(lsDouble);
    }

    public static void printElement(List<?> list){
        for(Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void printElementNumber(List<? extends Number> list){
        for(Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
