package Lesson5_Method;

public class MyMethod {

    public static void myMethod(String name, int age){

        System.out.print("My name is " + name + " Le" + " and " );
        System.out.println(age + " years old.");
    }

    public static int printNumber(int a){

        return a+=5;
    }
    public static int printNumber(int a, int b ){

        return a+=b;
    }

    public static void main(String[] args) {

        System.out.println("Welcome everyone!");
        myMethod("Hang",22);
        myMethod("Huyen",23);
        myMethod("Hai",10);

        System.out.println("The number is: " + printNumber(3));
        System.out.println("The number is: " + printNumber(3,10));
    }
}
