package Lesson10_Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {

    public static void main(String[] args) {

        //Non - Generics
        ArrayList array = new ArrayList<>();
        array.add(1);
        array.add("hello world");
        array.add(true);

        System.out.println((int)array.get(0));
//        System.out.println((String)array.get(0)); -> ERROR

        System.out.println((String)array.get(1));
        System.out.println((boolean)array.get(2));


        //Generics
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        System.out.println(array1.get(1));

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("Hello");
        array2.add("An");
        array2.add("Cuc");
       Iterator ls = array2.iterator();
       while(ls.hasNext()){
           System.out.print(ls.next() + " ");
       }


    }
}
