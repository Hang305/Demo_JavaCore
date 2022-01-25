package Lesson7_Interface;

public class WarehouseOrder extends Order{
    @Override
    public void validate() {
        System.out.println("Warehouse order is validate.");
    }

    @Override
    public void process() {
        System.out.println("Warehouse order is processing.");
    }
}
