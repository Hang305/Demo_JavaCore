package Lesson1_variable;

public class type {

    public static void main(String[] args) {

        //int
        int number = 912472758;

        //char
        char a =105, b=66 , c=67;

        //boolean
        boolean isCorrect = true;
        boolean isPrint = false;

        float f1 = 35e3f;
        double d1 = 12E4d;

        //string
        String fullname ="Le Thi Thanh Hang";

        //ọbject
        Student name = new Student();
        type func = new type();

        System.out.println("The number is " +number);
        System.out.println(a + " " +b +" " +c);
        System.out.println("The field is "+ isCorrect);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(f1 + d1);
        System.out.println("My fullname is "+fullname);
        System.out.println(name);
        System.out.println(func);

    };
    public static class Student {

    }

}
