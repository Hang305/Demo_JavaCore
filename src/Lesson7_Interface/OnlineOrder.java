package Lesson7_Interface;

public class OnlineOrder extends Order{

    private String couponCode;

    @Override
    public void validate() {
        System.out.println("Online order is validate.");
    }

    @Override
    public void process() {
        System.out.println("Online order is processing.");
    }
}
