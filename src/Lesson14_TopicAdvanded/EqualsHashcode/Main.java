package Lesson14_TopicAdvanded.EqualsHashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1,"Thanh Hang");
        Student student2 = new Student(1,"Thanh Hang");

        //Must override method equals to get obj to make objects compare
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        Set<Student> listSet = new HashSet<>();
        listSet.add(student1);
        listSet.add(student2);

        for(Student item: listSet){
            System.out.println(item);
        }
    }


}
