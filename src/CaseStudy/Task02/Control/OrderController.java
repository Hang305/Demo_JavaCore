package CaseStudy.Task02.Control;

import CaseStudy.Task01.Customer;
import CaseStudy.Task01.Order;
import CaseStudy.Task01.Product;
import CaseStudy.Task01.SchoolSupplies;

import java.time.LocalDateTime;
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

}
