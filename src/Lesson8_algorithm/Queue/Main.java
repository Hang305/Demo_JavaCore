package Lesson8_algorithm.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //Queue - First In First Out

        Queue queue = new LinkedList();

        Queue priority = new PriorityQueue();

        //add item into the last queue
        //add - reviced Exception
        queue.add("Hello");

        //also add  as offer - false
        queue.offer("world!");
        queue.offer("Hi eveyone!");

        System.out.println(queue);

        //poll - delete the first item when queue is null, the system will be display error msg
//        System.out.println(queue.poll());

        //remove - delete the first item when queue is null, the system will be return value "null"
        System.out.println(queue.remove());
        System.out.println(queue);

        //get the first item with element when queue is null, the system will be display error msg
        System.out.println(queue.element());

        //get the first item with peek when queue is null, the system will be return value "null"
        System.out.println(queue.peek());
    }
}
