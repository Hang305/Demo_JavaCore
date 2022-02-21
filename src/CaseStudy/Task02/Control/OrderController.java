package CaseStudy.Task02.Control;

import CaseStudy.Task01.Customer;
import CaseStudy.Task01.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderController extends Order {

    private List<Order> listOrders;
    Long unitPrice, total;
    Customer customer = new Customer();


    public OrderController() {
        this.listOrders = new ArrayList<>();
    }

    //add orders
    public void addOrder(Order listOrders) {
        this.listOrders.add(listOrders);
    }

    public List<Order> getListOrders() {
        return this.listOrders;
    }

    public void showInformationOrder() {
        System.out.println("Order ID: " + this.getOrderId() + "\n Customer name: " + this.getCustomerId() + "\n Quantity: " + this.getProductId() + "\n Unit: " + this.getUnit() +
                "\nQuantity buy:" + this.getQuantityBuy() + "\n Date buy:" + this.getBuyDate() + "\n Total: " + total);
//        this.listOrders.forEach(order -> order.toString());
    }

    public void setListOrders(List<Order> listOrders) {
        this.listOrders = listOrders;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
