package CaseStudy.Task01;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private Integer categoryId;
    private String categoryType;
    private String description;

    public Category(Integer categoryId, String categoryType, String description) {
        this.categoryId = categoryId;
        this.categoryType = categoryType;
        this.description = description;
    }

    public static List<String> showListCategoryOfBook(){

        List<String >listCategoryOfBook = new ArrayList<>();

        listCategoryOfBook.add("Literature");
        listCategoryOfBook.add("Science");
        listCategoryOfBook.add("Politics");
        listCategoryOfBook.add("Religion");
        listCategoryOfBook.add("Children");

        return listCategoryOfBook;
    }
    public static List<String> showListCategoryOfToy(){

        List<String >listCategoryOfToy = new ArrayList<>();

        listCategoryOfToy.add("Group 0-3 years age");
        listCategoryOfToy.add("Group 4-8 years age");
        listCategoryOfToy.add("Group over 8 years age");

        return listCategoryOfToy;
    }
    public static List<String> showListCategoryOfSchoolSupplies(){

        List<String >listCategoryOfSchoolSupplies = new ArrayList<>();

        listCategoryOfSchoolSupplies.add("The primary school");
        listCategoryOfSchoolSupplies.add("The junior high school");
        listCategoryOfSchoolSupplies.add("The high school");

        return listCategoryOfSchoolSupplies;
    }

}
