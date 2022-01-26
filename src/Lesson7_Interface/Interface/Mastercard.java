package Lesson7_Interface.Interface;

public class Mastercard implements PaymentGatement{

    @Override
    public void payment() {

        System.out.println("Please payment gatement for Mastercard.");
    }
}
