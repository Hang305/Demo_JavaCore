package CaseStudy.Task01;

import java.util.List;

public class ChildrenToy extends Product {

    private String origin;
    private String brand;
    private String supplier;
    private String userManual;

    public ChildrenToy() {

    }

    @Override
    public void getInformation(List<String> listToy) {

        System.out.println(" ProductID: " + this.getProductId()+  "\n Product name: " + this.getProductName() + "\n Quantity: "+ this.getQuantity() + "\n Unit: "+ this.getUnit() +
                "\n Category name: "+ this.getCategoryName()+ "\n Origin: " + this.getOrigin()+ "\n Brand: "+ this.getBrand()+ "\n Supplier: "+ this.getSupplier()+
                "\n User manual: " + this.getUserManual());
    }

    @Override
    public double discountPercent(String customer) {

        if (customer == "VIP1"){
            return 0.05;
        }else if(customer =="VIP2"){
            return 0.07;
        } else
            return 0.02;

    }

    public ChildrenToy(String productId, String productName, Integer quantity, long unit, String categoryName, String origin, String brand, String supplier, String userManual) {
        super(productId, productName, quantity, unit, categoryName);
        this.origin = origin;
        this.brand = brand;
        this.supplier = supplier;
        this.userManual = userManual;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getUserManual() {
        return userManual;
    }

    public void setUserManual(String userManual) {
        this.userManual = userManual;
    }

    @Override
    public String toString() {
        return "ChildrenToy{" +
                "ProductID='" + getProductId() + '\'' +
                "Product name='" + getProductName() + '\'' +
                "Quantity='" + getQuantity() + '\'' +
                "Unit='" + getUnit() + '\'' +
                "Category name='" + getCategoryName() + '\'' +
                "origin='" + origin + '\'' +
                ", brand='" + brand + '\'' +
                ", supplier='" + supplier + '\'' +
                ", userManual='" + userManual + '\'' +
                '}';
    }
}
