package CaseStudy.Task04.View;

import CaseStudy.Task02.Control.ChildrenToyController;
import CaseStudy.Task03.Model.ChildrenToyFile;
import CaseStudy.Task04.Validate.ValidateProductId;

import java.util.List;
import java.util.Scanner;

public class ChildrenToy {

    public static final String FILE_CHILDRENTOY = "src/CaseStudy/Task03/Data/ChildrenToy.csv";
    Scanner scanner = new Scanner(System.in);
    ChildrenToyController toyController = new ChildrenToyController();
    String productId;

    public void searchToyByName() {
        System.out.println("Enter name of children toy to search: ");
        String inputSearchOfToy = scanner.nextLine();
        toyController.searchToyByName(inputSearchOfToy).forEach(childrenToy -> System.out.println(childrenToy.toString()));
    }

    public void showInformation() {
        System.out.println("The children toy information list: ");
        //Read file
        List<String> listToy =ChildrenToyFile.readFile(FILE_CHILDRENTOY);
         toyController.showListInformationToy(listToy);
    }

    public void insertToy() {

        //Validate product id
        ValidateProductId productid = new ValidateProductId();
        productId = productid.validateProductId();

        //Import product name
        System.out.println("Enter children name: ");
        String toyName = scanner.nextLine();

        //Import quantity
        System.out.println("Enter quantity: ");
        int quantityOfToy = scanner.nextInt();

        //Import unit
        System.out.println("Enter unit of book: ");
        Long unitOfToy = scanner.nextLong();

        //Choose category
        System.out.println("Please choose a category: ");
        System.out.println("\t 1: Group 0-3 years age");
        System.out.println("\t 2: Group 4-8 years age");
        System.out.println("\t 3: Group over 8 years age");
        scanner.nextLine();
        String indexCategoryToy = scanner.nextLine();
        String categoryToy = "";
        switch (indexCategoryToy) {
            case "1":
                categoryToy = "Group 0-3 years age";
                break;
            case "2":
                categoryToy = "Group 4-8 years age";
                break;
            case "3":
                categoryToy = "Group over 8 years age";
                break;
            default:
                System.out.println("Input invalid!");
                break;
        }

        //Import origin
        System.out.println("Enter origin of children toy: ");
        String originOfToy = scanner.nextLine();

        //Import brand
        System.out.println("Enter brand of book: ");
        String brandOfToy = scanner.nextLine();

        //Import supplier
        System.out.println("Enter supplier of toy: ");
        String supplierOfToy = scanner.nextLine();

        //Import use manual
        System.out.println("Enter user manual of toy: ");
        String userManualOfToy = scanner.nextLine();

        //Insert data into DB
        CaseStudy.Task01.ChildrenToy listToys = new CaseStudy.Task01.ChildrenToy(productId, toyName, quantityOfToy, unitOfToy, categoryToy, originOfToy, brandOfToy, supplierOfToy, userManualOfToy);
        toyController.addChildrenToy(listToys);
        System.out.println("Insert data successfully!");

        //Import data into file csv
        ChildrenToyFile.writeFile(FILE_CHILDRENTOY, toyController.getListToy());
    }
}
