package CaseStudy.Task02.Control;

import CaseStudy.Task01.Product;
import CaseStudy.Task02.MainmenuControll;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookController {

    private List<Book> listBooks;
    private List<Product> listProducts;

    public BookController(List<Book> listBooks) {
        this.listBooks = listBooks;
    }

    //add product
    public void addProduct(Book book) {

        this.listBooks.add(book);
    }

    //search product
    public List<Product> searchProductByName(String name) {
        return this.listProducts.stream().filter(o->o.getProductName().contains(name)).collect(Collectors.toList());
    }

    //Show list information product
    public void showListInformationProduct() {
        this.listBooks.forEach(o -> System.out.println(o.toString()));
    }


    //delete product
    public void deleteProduct() {

    }

}
