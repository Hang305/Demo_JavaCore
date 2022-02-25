package CaseStudy.Task04.View;

import CaseStudy.Task02.Control.SchoolSuppliesController;
import CaseStudy.Task03.Model.SchoolSuppliesFile;

import java.util.Scanner;

public class SchoolSupplies {
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_SCHOOLSUPPLIES = "src/CaseStudy/Task03/Data/SchoolSupplies.csv";
    SchoolSuppliesController schoolController = new SchoolSuppliesController();

    public void showInformation(){
        System.out.println("The school supplies information list: ");
//                            schoolController.showListInformationSchool();
        //Read file
        SchoolSuppliesFile.readFile(FILE_SCHOOLSUPPLIES);
    }

    public void searchSchoolByName(){
        System.out.println("Enter name of school supplies to search: ");
        String inputSearchOfSchool = scanner.nextLine();
        schoolController.searchSchoolByName(inputSearchOfSchool).forEach(schoolSupplies -> System.out.println(schoolSupplies.toString()));
    }

    public void insertSchool(){
        System.out.println("Enter school supplies Id: ");
        String schoolSuppliesID = scanner.nextLine();
        System.out.println("Enter school supplies name: ");
        String schoolName = scanner.nextLine();
        System.out.println("Enter quantity: ");
        int quantityOfSchool = scanner.nextInt();
        System.out.println("Enter unit of School: ");
        Long unitOfSchool = scanner.nextLong();

        System.out.println("Please choose a category: ");
        System.out.println("\t 1: The primary school");
        System.out.println("\t 2: The junior high school");
        System.out.println("\t 3: The high school");
        scanner.nextLine();
        String indexCategorySchool = scanner.nextLine();

        String categorySchool = "";
        switch (indexCategorySchool) {
            case "1":
                categorySchool = "The primary school";
                break;
            case "2":
                categorySchool = "The junior high school";
                break;
            case "3":
                categorySchool = "The high school";
                break;
            default:
                System.out.println("Input invalid!");
                break;
        }
        System.out.println("Enter origin of school supplies: ");
        String originOfSchool = scanner.nextLine();
        System.out.println("Enter brand of School supplies: ");
        String brandOfSchool = scanner.nextLine();
        System.out.println("Enter supplier of school supplies: ");
        String supplierOfSchool = scanner.nextLine();
        System.out.println("Enter user manual of school supplies: ");
        String userManualOfSchool = scanner.nextLine();
        System.out.println("Enter color of school supplies: ");

        System.out.println("Please choose the color: ");
        System.out.println("\t 1: Blue");
        System.out.println("\t 2: Red");
        System.out.println("\t 3: Yellow");
        System.out.println("\t 4: Black");
        System.out.println("\t 5: White");

        String indexColor = scanner.nextLine();
        String color = "";
        switch (indexColor) {
            case "1":
                color = "Blue";
                break;
            case "2":
                color = "Red";
                break;
            case "3":
                color = "Yellow";
                break;
            case "4":
                color = "Black";
                break;
            case "5":
                color = "White";
                break;
            default:
                System.out.println("Input invalid!");
                break;
        }
        System.out.println("Enter material of school supplies: ");
        String materialOfSchool = scanner.nextLine();

        double size = 0.0f;
        do {
            System.out.println("Enter size of school supplies: ");
            size = scanner.nextDouble();
        } while (size <= 0.0f);

        //Insert data into DB
        CaseStudy.Task01.SchoolSupplies listSchools = new CaseStudy.Task01.SchoolSupplies(schoolSuppliesID, schoolName, quantityOfSchool, unitOfSchool, categorySchool, originOfSchool, brandOfSchool, supplierOfSchool, userManualOfSchool, color, materialOfSchool, size);
        schoolController.addSchool(listSchools);
        System.out.println("Insert data successfully!");

        //Import data into file csv
        SchoolSuppliesFile.writeFile(FILE_SCHOOLSUPPLIES, schoolController.getListSchools());
    }
}
