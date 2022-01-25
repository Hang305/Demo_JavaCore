package Lesson6_OOP;

public class Inheritance {

    public static void main(String[] args) {

        Student  student = new Student("Thanh Hang", 22,"Hue, Viẹt Nam", 9.5, "IT");
        System.out.println(student.get_name() +" "+ student.get_className());

        Teacher teacher = new Teacher("Thanh Hai",40,"Hue, Viẹt Nam ","Coding","Procesor");
        System.out.println(teacher.get_name() + " " + teacher.get_level());

        Employee employee = new Employee("Thanh Huyen", 30, "Hue, Viet Nam","Freelance");
        System.out.println(employee.get_name() + " "+ employee.get_job());

    }
}

//PERSONA
class person{
    private String _name;
    private int _age;
    private String _address;

    public person(String _name, int _age, String _address) {
        this._name = _name;
        this._age = _age;
        this._address = _address;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }
}

//STUDENT
class Student extends person{

    private double _averageScore;
    private String _className;

    public Student(String _name, int _age, String _address, double _averageScore, String _className) {
        super(_name, _age, _address);
        this._averageScore = _averageScore;
        this._className = _className;
    }

    public double get_averageScore() {
        return _averageScore;
    }

    public void set_averageScore(double _averageScore) {
        this._averageScore = _averageScore;
    }

    public String get_className() {
        return _className;
    }

    public void set_className(String _className) {
        this._className = _className;
    }
}

//TEACHER
class Teacher extends person{
    private String _subName;
    private String _level;

    public Teacher(String _name, int _age, String _address, String _subName, String _level) {
        super(_name, _age, _address);
        this._subName = _subName;
        this._level = _level;
    }

    public String get_subName() {
        return _subName;
    }

    public void set_subName(String _subName) {
        this._subName = _subName;
    }

    public String get_level() {
        return _level;
    }

    public void set_level(String _level) {
        this._level = _level;
    }
}

//EMPLOYEE
class Employee extends person{

    private String _job;

    public Employee(String _name, int _age, String _address, String _job) {
        super(_name, _age, _address);
        this._job = _job;
    }

    public String get_job() {
        return _job;
    }

    public void set_job(String _job) {
        this._job = _job;
    }
}
