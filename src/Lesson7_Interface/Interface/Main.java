package Lesson7_Interface.Interface;

public class Main {

    public static void main(String[] args) {

        PaymentGatement payment = new PaymentGatement() {
            @Override
            public void payment() {
                System.out.println("Please choose the payment gatement.");
            }
        };
    }
}
