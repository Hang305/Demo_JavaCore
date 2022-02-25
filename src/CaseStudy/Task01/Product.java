package CaseStudy.Task01;

import java.util.List;

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
    public abstract void getInformation(List<String> listInfo);

    public Product(String productId, String productName, Integer quantity, long unit, String categoryName) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unit = unit;
        this.categoryName = categoryName;
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
