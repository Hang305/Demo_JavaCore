package CaseStudy.Task02.Control;

import CaseStudy.Task01.ChildrenToy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChildrenToyController {
    private List<ChildrenToy> listToys;

    public ChildrenToyController() {
        this.listToys = new ArrayList<>();
    }

    //add book
    public void addChildrenToy(ChildrenToy listToys) {
        this.listToys.add(listToys);
    }

    //search book
    public List<ChildrenToy> searchToyByName(String name) {
        return this.listToys.stream().filter(o -> o.getProductName().contains(name)).collect(Collectors.toList());
    }

    //Show list information children toy
    public void showListInformationToy() {
        this.listToys.forEach(o -> System.out.println(o.toString()));
    }

    @Override
    public String toString() {
        return "SchoolToyController{" +
                "listToys=" + listToys +
                '}';
    }
}
