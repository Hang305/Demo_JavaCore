package Lesson8_algorithm.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //compair of stack and queue - first in first out and first in last out
        //has: LinkedList() and ArrayDeque()
        //CHI CHEN DAU VA CHEN CUOI DAY

        Deque<Integer> deque = new LinkedList();

        Deque<Integer> array = new ArrayDeque();

        //add(), addLast(), offerLast(): them vao cuoi phan tu
        deque.add(1);
        deque.addLast(2);
        deque.offerLast(3);

        //push(), addFirst(), offerFirst(): them vao dau danh sach
        deque.push(4);
        deque.addFirst(5);
        deque.offerFirst(6);

        //peek(), peekFirst(), getFirst(): truy xuat dau phan tu danh sach
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.getFirst());

        //peekLast(), getLast():  truy xuat phan tu cuoi danh sach
        System.out.println(deque.peekLast());
        System.out.println(deque.getLast());

        //remove(), removeFirst(), poll(), pollFirst(): xoa phan tu dau danh sach
//        System.out.println(deque.remove());
//        System.out.println(deque.removeFirst());
//        System.out.println(deque.poll());
//        System.out.println(deque.pollFirst());

        //removeLast(), pollLast(): xoa phan tu cuoi danh sach
//        System.out.println(deque.removeLast());
//        System.out.println(deque.pollLast());

        //contains: kiem tra phan tu co trong danh sach - return true/false
        System.out.println(deque.contains(4));

        Iterator list = deque.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }

        //OR
        for(Integer dequelist : deque){
            System.out.print(dequelist + " ");
        }

        System.out.print("\n "+ deque + " ");
    }
}
