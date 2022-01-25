package Lesson6_OOP;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.set_name("Thanh Hang");
        persona.set_age(22);

        Books book = new Books();
        book.set_name("Conan");
        book.set_quantity(40);
        book.set_publisher("Kim Dong Publisher");

        persona.borrowBook(book,persona.get_name());
    }
}
