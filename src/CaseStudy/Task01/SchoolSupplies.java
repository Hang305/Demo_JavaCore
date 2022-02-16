package CaseStudy.Task01;

public class SchoolSupplies extends Product {

    private String origin;
    private String brand;
    private String supplier;
    private String userManual;
    private String color;
    private String material;
    private String size;

    public SchoolSupplies(String productId, String productName, Integer quantity, long unit, String categoryName, String origin, String brand, String supplier, String userManual, String color, String material, String size) {
        super(productId, productName, quantity, unit, categoryName);
        this.origin = origin;
        this.brand = brand;
        this.supplier = supplier;
        this.userManual = userManual;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    @Override
    public String getInformation(String MaSP) {

        return " Product ID: " + this.getProductId()+  "\n Product name: " + this.getProductName() + "\n Quantity: "+ this.getQuantity() + "\n Unit: "+ this.getUnit() +
                "\n Category name: "+ this.getCategoryName()+ "\n Origin: " + this.getOrigin()+ "\n Brand: "+ this.getBrand()+ "\n Supplier: "+ this.getSupplier()+
                "\n User manual: " + this.getUserManual() + "\n Color: "+ this.getColor()+ "\n Material: "+ this.getMaterial()+ "\n Size: "+ this.getSize();
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SchoolSupplies{" +
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
