package CaseStudy.Task02.Control;

import CaseStudy.Task01.Product;

import CaseStudy.Task01.Book;
import java.util.List;
import java.util.stream.Collectors;

public class BookController {

    private List<Book> listBooks;
    private List<Product> listProducts;

    public BookController(List<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public BookController() {

    }

    //add product
    public void addPBook(Book book) {

        this.listBooks.add(book);
    }

    //search product
    public List<Product> searchBookByName(String name) {
        return this.listProducts.stream().filter(o->o.getProductName().contains(name)).collect(Collectors.toList());
    }

    //Show list information product
    public void showListInformationBook() {
        this.listBooks.forEach(o -> System.out.println(o.toString()));
    }


    //delete product
    public void deleteBook() {

    }

}
