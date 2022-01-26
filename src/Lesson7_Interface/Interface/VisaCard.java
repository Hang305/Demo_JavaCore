package Lesson7_Interface.Interface;

public class VisaCard implements PaymentGatement{

    @Override
    public void payment() {
        System.out.println("Please payment gatement for Visacard.");
    }
}
