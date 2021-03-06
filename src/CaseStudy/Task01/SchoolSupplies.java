package CaseStudy.Task01;

import java.util.List;

public class SchoolSupplies extends Product {

    private String origin;
    private String brand;
    private String supplier;
    private String userManual;
    private String color;
    private String material;
    private Double size;

    public SchoolSupplies(String productId, String productName, Integer quantity, long unit, String categoryName, String origin, String brand, String supplier, String userManual,
                          String color, String material, Double size) {
        super(productId, productName, quantity, unit, categoryName);
        this.origin = origin;
        this.brand = brand;
        this.supplier = supplier;
        this.userManual = userManual;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public SchoolSupplies() {

    }

    @Override
    public void getInformation( List<String> listSchool) {
        System.out.format("%-15s%-15s%-15s%-15s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",listSchool.get(0) , listSchool.get(1) ,listSchool.get(2) ,listSchool.get(3) ,listSchool.get(4)
                , listSchool.get(5), listSchool.get(6) ,listSchool.get(7), listSchool.get(8), listSchool.get(9), listSchool.get(10), listSchool.get(11));
    }

    @Override
    public double discountPercent(String khachhang) {

        if (khachhang == "VIP1"){
            return 0.03;
        }else if(khachhang =="VIP2"){
            return 0.07;
        } else
            return 0.01;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SchoolSupplies{" +
                "ProductID='" + getProductId() + '\'' +
                "Product name='" + getProductName() + '\'' +
                "Quantity='" + getQuantity() + '\'' +
                "Unit='" + getUnit() + '\'' +
                "Category name='" + getCategoryName() + '\'' +
                "origin='" + origin + '\'' +
                ", brand='" + brand + '\'' +
                ", supplier='" + supplier + '\'' +
                ", userManual='" + userManual + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
