package CaseStudy.Task02.Control;

import CaseStudy.Task01.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductController {

    private List<Product> listProducts;
    BookController bookController = new BookController();
    ChildrenToyController toyController = new ChildrenToyController();
    SchoolSuppliesController schoolController = new SchoolSuppliesController();
    long unit;


    public ProductController() {
        this.listProducts = new ArrayList<>();
    }


//    public void showListInformationProduct(List<String> list) {
//        this.listProducts.forEach(product -> product.getInformation());
//    }

    public List<Product> getListProducts() {
        return this.listProducts;
    }

    public List<Product> searchProductByID(String id) {
        return this.listProducts.stream().filter(o -> o.getProductId().contains(id)).collect(Collectors.toList());
    }

    //Search by product id
    public List<Product> getListProduct(String productId) {
        List<Product> listResult = new ArrayList<>();
        for (Product listProduct : bookController.getListBook()){
            if (listProduct.getProductId().contains(productId)){
                listResult.add(listProduct);
            }
        }
        for (Product listProduct : toyController.getListToy()){
            if (listProduct.getProductId().contains(productId)){
                listResult.add(listProduct);
            }
        }
        for (Product listProduct : schoolController.getListSchools()){
            if (listProduct.getProductId().contains(productId)){
                listResult.add(listProduct);
            }
        }
        return listResult;
    }

    //Get product id
    public String  getProductId (String productId){
        String  result ="";
        for (Product listProduct : bookController.getListBook()){
            if (listProduct.getProductId() == productId){
                result = productId;
               return result;
            }
            break;
        }
        for (Product listProduct : toyController.getListToy()){
            if (listProduct.getProductId()== productId){
                result = productId;
                return result;
            }
            break;
        }
        for (Product listProduct : schoolController.getListSchools()){
            if (listProduct.getProductId()==productId){
                result = productId;
                return result;
            }
            break;
        }
        return  result;
    }

    //get unit from product id
    public Long getUnitByProductId(String productId){
        if (this.getListProduct(productId)!=null ){
            for (Product item : getListProduct(productId)){
                unit = item.getUnit();
                return unit;
            }
        }
        return unit;
    }

}

