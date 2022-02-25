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

    Customer customer = new Customer();
    ProductController productController = new ProductController();

    public Order(String orderId, String customerid, String productId, Integer quantity, String dateBuy) {
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
        this.productId = listOrders.get(2);
        System.out.println(this.productId);

        System.out.println(" Order ID: " + listOrders.get(0) + "\n Customer id: " + listOrders.get(1) + "\n Product id: "
                + listOrders.get(2) + "\n Date buy:" + listOrders.get(3) + "\n Unit: " + getUnitOfProduct(listOrders.get(2))
                + "\n Quantity buy: " + listOrders.get(5) + "\n Total: " + unit * quantityBuy);
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

    public long getUnitOfProduct(String productId) {

        if (productId == productController.getProductId(productId)){
            unit = productController.getUnitByProductId(productId);
        }
        return unit;

    }
}
