package Lesson7_Interface.Abstract;

public class StoreOrder extends Order {
    @Override
    public void validate() {
        System.out.println("Stores order is validate.");
    }

    @Override
    public void process() {
        System.out.println("Stores order is processing.");
    }
}
