package CaseStudy.Task01;

public class Bill {

    private String billId;
    private String customerId;
    private String productId;
    private Integer quantity;
    private String buyDate;
    private long unit;
    private long total;

    public Bill(String billId, String customerId, String productId, Integer quantity, String buyDate, long unit) {
        this.billId = billId;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.buyDate = buyDate;
        this.unit = unit;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        this.total = total;
    }
}
