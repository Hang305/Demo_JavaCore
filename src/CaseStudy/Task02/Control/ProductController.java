package CaseStudy.Task02.Control;

import CaseStudy.Task01.Book;
import CaseStudy.Task01.ChildrenToy;
import CaseStudy.Task01.Product;
import CaseStudy.Task01.SchoolSupplies;
import CaseStudy.Task03.Model.BookFile;
import CaseStudy.Task03.Model.ChildrenToyFile;
import CaseStudy.Task03.Model.OrderFile;
import CaseStudy.Task03.Model.SchoolSuppliesFile;

import javax.print.attribute.standard.JobKOctets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static CaseStudy.Task04.View.Book.FILE_BOOK;
import static CaseStudy.Task04.View.ChildrenToy.FILE_CHILDRENTOY;
import static CaseStudy.Task04.View.Order.FILE_ORDER;
import static CaseStudy.Task04.View.SchoolSupplies.FILE_SCHOOLSUPPLIES;
import static java.util.List.*;

public class ProductController {

    public List<Product> listProducts;
    BookController bookController = new BookController();
    ChildrenToyController toyController = new ChildrenToyController();
    SchoolSuppliesController schoolController = new SchoolSuppliesController();
    long unit;
    List<Product> listResult = new ArrayList<>();


    public ProductController() {
        this.listProducts = new ArrayList<>();
    }

    public List<Product> getListProducts() {
        return this.listProducts;
    }

    public List<Product> searchProductByID(String id) {
        return this.listProducts.stream().filter(o -> o.getProductId().contains(id)).collect(Collectors.toList());
    }

    //Search by product id
    public Product searchProductId(String productId) {
        List<Object> listResult = new ArrayList<>();
        List<String> listBooks = BookFile.readFile(FILE_BOOK);
        List<String> listToys = ChildrenToyFile.readFile(FILE_CHILDRENTOY);
        List<String> listSchools = SchoolSuppliesFile.readFile(FILE_SCHOOLSUPPLIES);
        for (String items : listBooks) {
            listResult.add(items);
        }
        for (String items : listToys) {
            listResult.add(items);
        }
        for (String items: listSchools){
            listResult.add(items);
        }
        for (Object item : listResult){
            Product product = (Product) item;
            if (item.equals(product.getProductId())){

                return product;
            }
        }
        return null;

    }

}

