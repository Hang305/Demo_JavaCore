package CaseStudy.Task01;

public abstract class Product {
    private String productId;
    private String productName;
    private Integer quantity;
    private long unit;
    private String categoryName;

    String[] categoryOfBook = {"Primary school", "High junior school", "High school"};

    public Product() {

    }

    public abstract double discountPercent(String customer);

    public Product(String productId, String productName, Integer quantity, long unit, String categoryName) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unit = unit;
        this.categoryName = categoryName;
    }

    public void getInformation() {
        System.out.println("Product ID: " + this.getProductId() + "\n Product name: " + this.getProductName() + "\n Quantity: " + this.getCategoryName() + "\n Unit: " + this.getUnit() +
                "\n Category name:" + this.getCategoryName() + "\n Publisher:");
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public long getUnit() {
        return unit;
    }

    Order order = new Order();

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public String getCategoryName() {

        for (int i = 0; i < categoryOfBook.length; i++) {
            switch (categoryName) {
                case "Primary school":
                    categoryName = categoryOfBook[i];
                    break;
                case "High junior school":
                    categoryName = categoryOfBook[i];
                    break;
                case "High school":
                    categoryName = categoryOfBook[i];
                    break;
            }
        }

        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unit=" + unit +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
