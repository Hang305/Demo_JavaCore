package CaseStudy.Task02.Control;

import CaseStudy.Task01.Product;

import CaseStudy.Task01.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookController {

    private List<Book> listBooks;

    public BookController() {
        this.listBooks = new ArrayList<>();
    }

    //add book
    public void addBook(Book listBooks) {
        this.listBooks.add(listBooks);
    }

    //search book
    public List<Book> searchBookByName(String name) {
        return this.listBooks.stream().filter(o -> o.getProductName().contains(name)).collect(Collectors.toList());
    }

    //Show list information product
    public void showListInformationBook() {
        this.listBooks.forEach(book -> book.getInformation());
    }

    //
    public List<Book> getListBook(){
        return this.listBooks;
    }
    @Override
    public String toString() {
        return "BookController{" +
                "listBooks=" + listBooks +
                '}';
    }
}
