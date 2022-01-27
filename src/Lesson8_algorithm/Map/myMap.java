package Lesson8_algorithm.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class myMap {

    public static void main(String[] args) {

        Map hashmap = new HashMap();

        Map truemap = new TreeMap();

        HashMap<String, String> hash = new HashMap<>();

        //put
        hash.put("ID01","Thanh hang");
        hash.put("ID02","Thanh Huyen");
        System.out.println(hash);

        //get by Key
        System.out.println("Get the first value in hashmap: " + hash.get("ID01"));

        HashMap<String, String> hash2 = new HashMap<>();
        //pullAll
        hash2.putAll(hash);
        hash2.put("ID03", "Thanh Hai");
        System.out.println(hash2);

        //remove
//        hash2.remove("ID02");

        //clear
//        hash2.clear();

        //list item in hashmap with value Key
        for(String item : hash2.keySet()){
            System.out.print(item + " ");
        }

        System.out.println("\n----------------");

//        list item in hashtag with values
        for(String item : hash2.values()){
            System.out.print(item + " ");
        }
        System.out.println("\n----------------");

        //contains key has exists - return boolean
        System.out.println(hash2.containsKey("ID03"));

        //contains value has exists - return boolean
        System.out.println(hash2.containsValue("Thanh"));

    }
}
