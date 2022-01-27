package Lesson8_algorithm.Set;

import java.util.*;

public class mySet {

    public static void main(String[] args) {

        Set setA = new HashSet();

        //add()
        setA.add("Thanh");
        setA.add("Hang");
        setA.add("Hang");

        //addAll()
        Set setB = new HashSet();
        setB.addAll(setA);

        //remove
//        setA.remove("Thanh");

        //clear
//        setA.clear();

        //size
        System.out.println("size: "+ setA.size());

        //isEmpty - return boolean is true/false
        Set setC = new HashSet();
        System.out.println("isEmpty: "+ setC.isEmpty());

        //convert set to arrayList
        List<String> list = new ArrayList<>();
        list.addAll(setB);
        System.out.println("List data convert set to arraylist: ");
        for( String item: list){
            System.out.print(item + " ");
        }
        System.out.println("\n ----------------");


        //Display item in set
        for (Object item :setA){

            String obj = (String)item ;
            System.out.print(obj+ " ");
        }
        System.out.println("\n----------------");
        //OR
        Iterator<String> iterator = setA.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.print(item + " ");
        }

    }
}
