package Lesson14_TopicAdvanded.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Hang", 21));
        students.add(new Student("An", 32));
        students.add(new Student("Thuy", 18));

//        Collections.sort(students); //Sort by name

//        Collections.sort(students, new AgeCompar());// Sort by  age, create a new class

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });


        for (Student student : students) {
            System.out.println(student);
        }
    }

}
