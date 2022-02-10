package Lesson14_TopicAdvanded.PressedType;

public class Teacher extends Persona{

    private String level;

    public Teacher(String name, String level) {
        super(name);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Teacher(String name) {
        super(name);
    }
}
