package Lesson8_algorithm.Stack;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Stack - First In Last Out

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Size: "+ stack.size());

        System.out.println("List: "+ stack.pop());

//        System.out.println("list stack: ");
//        for(int i=1; i<=10; i++){
//            stack.push(i);
//            System.out.print(stack.pop() + " ");
//        }

        //peek: get the first item
        System.out.println("Get the first item in stack: "+ stack.peek());


        Iterator stackList = stack.iterator();
        System.out.println("List: ");
        while(stackList.hasNext()){
            System.out.print(stackList.next() + " " );
        }
    }
}
