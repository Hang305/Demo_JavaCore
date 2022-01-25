package Lesson6_OOP;

public class Books {

    private String _name;
    private int _quantity;
    private String _publisher;


    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }

    public void set_quantity(int _quantity) {
        this._quantity = _quantity;
    }

    public int get_quantity() {
        return _quantity;
    }

    public void set_publisher(String _publisher) {
        this._publisher = _publisher;
    }

    public String get_publisher() {
        return _publisher;
    }
}
