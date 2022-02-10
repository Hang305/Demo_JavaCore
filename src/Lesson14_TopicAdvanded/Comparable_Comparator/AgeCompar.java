package Lesson14_TopicAdvanded.Comparable_Comparator;

import java.util.Comparator;

public class AgeCompar implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
