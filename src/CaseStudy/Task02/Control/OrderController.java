package CaseStudy.Task02.Control;

import CaseStudy.Task01.Book;
import CaseStudy.Task01.Customer;
import CaseStudy.Task01.Order;
import CaseStudy.Task03.Model.OrderFile;
import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.List;

public class OrderController extends Order {

    private List<Order> listOrders;
    Long unitPrice, total;
    Customer customer = new Customer();
    String productId;
    ProductController productController = new ProductController();

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

    public void showInformationOrder(List<String> listOrder) {
        this.listOrders.forEach(order -> order.showInformation(listOrder));
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
}
