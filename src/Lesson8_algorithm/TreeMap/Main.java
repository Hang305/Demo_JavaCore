package Lesson8_algorithm.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, String> tree = new TreeMap();

        tree.put("ID01","Thanh Hang");
        tree.put("ID02","Thanh Huyen");
        tree.put("ID03","Thanh Hai");

        System.out.println(tree);

        for(Map.Entry item: tree.entrySet()){
            System.out.println(item.getKey() + " "+ item.getValue());
        }

        tree.remove("ID02");
        System.out.println(tree);

        tree.put("ID02","Thanh Huyen");
        tree.put("ID04","Tram");
        tree.put("ID05","An");

        System.out.println(tree.headMap("ID02"));

        System.out.println(tree.tailMap("ID02"));

        //[a,b)
        System.out.println(tree.subMap("ID02","ID04"));

    }
}
