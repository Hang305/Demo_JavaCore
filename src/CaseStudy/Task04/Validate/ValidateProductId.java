package CaseStudy.Task04.Validate;

import java.util.Scanner;

public class ValidateProductId {

    public static final String REGEX_PRODUCTID = "^\\SP+-+\\d{4}$";
    Scanner scanner = new Scanner(System.in);
    String productId;

    public String validateProductId() {
        System.out.println("Enter product id:");
        productId = scanner.nextLine();
        while (!productId.matches(REGEX_PRODUCTID)) {
            System.out.println("Input invalid with format SP-XXXX (X: 0-9) and ProductId does not match existing data. Enter product id again: ");
            productId = scanner.nextLine();
        }
        return productId;
    }
}
