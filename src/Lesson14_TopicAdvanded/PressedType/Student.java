package Lesson14_TopicAdvanded.PressedType;

public class Student extends Persona{

    private String Classroom;

    public Student(String name, String classroom) {
        super(name);
        Classroom = classroom;
    }

    public String getClassroom() {
        return Classroom;
    }

    public void setClassroom(String classroom) {
        Classroom = classroom;
    }

    public Student(String name) {
        super(name);
    }
}
