package CaseStudy.Task02.Control;

import CaseStudy.Task01.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductController {

    private List<Product> listProducts;

    public ProductController() {
        this.listProducts = new ArrayList<>();
    }


    public void showListInformationProduct() {
        this.listProducts.forEach(product -> product.getInformation());
    }
    public List<Product> getListProducts(){
        return this.listProducts;
    }
    public List<Product> searchProductByID(String id) {
        return this.listProducts.stream().filter(o -> o.getProductId().contains(id)).collect(Collectors.toList());
    }

}

