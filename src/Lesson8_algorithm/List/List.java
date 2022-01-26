package Lesson8_algorithm.List;
import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();

        students.add("Name");
        System.out.println(students);

        for (int i =1; i <=10; i++){

            students.add("Name"+i);

            System.out.print(students.get(i) + " ");
        }

        students.set(0,"Conan");
        System.out.println(students.get(0));

        System.out.println(students.get(5));
        students.remove(5);

        for (int i =1; i <=10; i++){

            students.add("Name"+i);

            System.out.print(students.get(i) + " ");
        }

        System.out.print("\n");
        System.out.println("Size of array list is " + students.size());
    }
}
