package CaseStudy.Task01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

    private String customerId;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String birthDate;
    private String customerType;

    public Customer(String customerId, String fullName, String phoneNumber, String email, String birthDate, String customerType) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
        this.customerType = customerType;
    }

    public Customer() {

    }
    public void showInformation(){
        System.out.println("Customer ID: " + this.customerId + "\n Full name: " + this.fullName + "\n Phone number: " + this.phoneNumber + "\n Email: " +this.email+
                "\n Birthday:" +this.birthDate + "\n Customer type:" + this.customerType );
    }
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
