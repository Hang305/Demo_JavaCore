package CaseStudy.Task04.Validate;

import java.util.Scanner;

public class PublishYearValidate {
    Integer publishYear;
    Scanner scanner = new Scanner(System.in);
    public PublishYearValidate(int year) {

            while (year <= 1000 || year > 2022) {
                System.out.println("Input invalid! Enter publish year again: ");
                scanner.next();
            }

//            publishYear = scanner.nextInt();
        System.out.println(publishYear);
    }

    public Integer getPublishYearValidate(){

        return publishYear;
    }

}
