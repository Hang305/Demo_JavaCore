package Lesson8_algorithm.SortSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //contructor: ọbject
        //auto: sort ASC (tang dan)

        SortedSet sort = new TreeSet();

        //add
        sort.add("Hang");
        sort.add("Huyen");
        sort.add("Hai");
        sort.add("Tram");
        sort.add("An");

//        remove
//        sort.remove("Hang");

        System.out.println(sort);

        //first
        System.out.println(sort.first());

        //last
        System.out.println(sort.last());

        //display list
        for(Object item : sort){
            System.out.print(item.toString() + " ");
        }

        System.out.println("\n-----------------");

        //OR display list in sortedSet
        Iterator<Object> iterator = sort.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }

        System.out.println("\n-----------------");

        //sort DESC -descendingIterator()
        Iterator sortDESC = ((TreeSet<?>) sort).descendingIterator();
        for (Iterator it = sortDESC; it.hasNext(); ) {
            Object item = it.next();
            System.out.print(item.toString() + " ");
        }

        System.out.println("\n-----------------");

        //get all the item have item less than the params item
        System.out.println(sort.headSet("Hang"));

        //get all the item have item greater than and equal the params item
        System.out.println(sort.tailSet("Hang"));
    }
}
