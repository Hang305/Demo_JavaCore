package Lesson6_OOP;

public class Persona {

    private String _name;
    private int _age;
    private Books book;

    public void borrowBook(Books book, String name){

        System.out.println(name + " borrowing the " + book.get_name() + " books");
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public int get_age() {
        return _age;
    }
}
