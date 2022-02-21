package CaseStudy.Task02.Control;

import CaseStudy.Task01.Book;
import CaseStudy.Task01.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> listCustomers;

    public CustomerController() {
        this.listCustomers = new ArrayList<>();
    }

    //add customer
    public void addCustomer(Customer listCustomers) {
        this.listCustomers.add(listCustomers);
    }

    public List<Customer> getListCustomers(){
        return this.listCustomers;
    }
}
