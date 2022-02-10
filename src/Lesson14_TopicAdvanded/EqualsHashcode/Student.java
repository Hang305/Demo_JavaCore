package Lesson14_TopicAdvanded.EqualsHashcode;

import java.util.Objects;

public class Student {

    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || !(o instanceof Student)){
            return false;
        }

        Student otherStudent = (Student) o;
        if(this.id == otherStudent.id){
            return true;
        }else
            return false;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(id, name);
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
