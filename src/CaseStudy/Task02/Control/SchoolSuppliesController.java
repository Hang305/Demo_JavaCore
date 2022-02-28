package CaseStudy.Task02.Control;

import CaseStudy.Task01.SchoolSupplies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SchoolSuppliesController {
    public List<SchoolSupplies> listSchools;

    public SchoolSuppliesController() {
        this.listSchools = new ArrayList<>();
    }

    //add book
    public void addSchool(SchoolSupplies listSchools) {
        this.listSchools.add(listSchools);
    }

    //search book
    public List<SchoolSupplies> searchSchoolByName(String name) {
        return this.listSchools.stream().filter(o -> o.getProductName().contains(name)).collect(Collectors.toList());
    }

    //Show list information children toy
    public void showListInformationSchool(List<String> listSchools) {
        this.listSchools.forEach(schoolSupplies -> schoolSupplies.getInformation(listSchools));
    }
    public List<SchoolSupplies> getListSchools(){
        return this.listSchools;
    }
    @Override
    public String toString() {
        return "SchoolSuppliesController{" +
                "listSchools=" + listSchools +
                '}';
    }
}
