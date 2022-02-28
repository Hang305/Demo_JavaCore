package CaseStudy.Task01;

import CaseStudy.Task02.Control.ProductController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Order {

    private String orderId;
    private String customerId;
    private String productId;
    private Integer quantityBuy = 0;
    private String buyDate;
    private long unit;
    private long total;

    public Order(String orderId, String customerId, String productId, Integer quantityBuy, String buyDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.quantityBuy = quantityBuy;
        this.buyDate = buyDate;
    }

    public Order() {

    }

    public Order(String s, String s1, String s2, String s3, String s4, String s5) {
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

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
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
        this.total = unit * quantityBuy;
    }

    public void showInformation(List<String> listOrders) {
        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20%\n",listOrders.get(0) , listOrders.get(1) ,listOrders.get(2) ,listOrders.get(3) ,listOrders.get(4)
               , listOrders.get(5), unit * quantityBuy);
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
                '}';
    }

    public long getUnitOfProduct(String productId) {

        return unit;
    }
}
