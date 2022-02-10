package Lesson14_TopicAdvanded.PressedType;

public class Main {

    public static void main(String[] args) {

        //Convert class persona to class student
        Persona student = new Student("Thanh Hang", "K52 THKT");

        Persona teacher = new Teacher("Phuong Thao", "Senior");

        teacher = student;        //Can pressed type when have class the same parent - Class Persona
        System.out.println(teacher.getName());

//        ((Student)student).setClassroom("K52 THKT");
        System.out.println(student.getName() + ", " + ((Student) student).getClassroom());

        //Can convert from int to float-> ep kieu ngam dinh
        int a = 5;
        float b;

        b = a;
        System.out.println(a + ", " + b);

        //Can convert form float to int -> ep kieu tuong minh
        int c;
        float d = 5;

        c = (int) d;
        System.out.println(c + "," + d);

        int e;
        float f = 5.5f;

        e = (int) f;
        System.out.println(e + "," + f);

    }
}
