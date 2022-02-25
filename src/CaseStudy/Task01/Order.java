package CaseStudy.Task01;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {

    private String orderId;
    private String customerId;
    private String productId;
    private Integer quantityBuy;
    private LocalDateTime buyDate;
    private long unit;
    private long total;

    Customer customer = new Customer();

    public Order(String orderId, String customerid, String productId, Integer quantity, LocalDateTime dateBuy) {
        this.orderId = orderId;
        this.customerId = customerid;
        this.productId = productId;
        this.quantityBuy = quantity;
        this.buyDate = dateBuy;
    }

    public Order() {

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String billId) {
        this.orderId = billId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantityBuy() {
        return quantityBuy;
    }

    public void setQuantityBuy(Integer quantity) {
        this.quantityBuy = quantity;
    }

    public LocalDateTime getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDateTime buyDate) {
        this.buyDate = buyDate;
    }

    public long getUnit() {
        return unit;
    }

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = unit*quantityBuy;
    }

    public void showInformation(){
        System.out.println(" Order ID: " + this.orderId + "\n Customer name: " + getOrderId() + "\n Quantity: " + getProductId() + "\n Unit: " + getUnit() +
                "\nQuantity buy:" + quantityBuy + "\n Date buy:" + buyDate + "\n Total: " + total);
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", productId='" + productId + '\'' +
                ", quantityBuy=" + quantityBuy +
                ", buyDate=" + buyDate +
                ", unit=" + unit +
                ", total=" + total +
                ", customer=" + customer +
                '}';
    }
}
