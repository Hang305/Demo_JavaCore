package CaseStudy.Task02.Control;

import CaseStudy.Task01.Book;
import CaseStudy.Task03.Model.BookFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static CaseStudy.Task04.View.Book.FILE_BOOK;

public class BookController {

    public List<Book> listBooks;
    List<String> listProduct;

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
    public void showListInformationBook(List<String> listBook) {
        this.listBooks.forEach(book -> book.getInformation(listBook));
    }

//    //
//    public List<String> getListBooks() {
//        List<String> listBook=  BookFile.readFile(FILE_BOOK);
//        return listBook;
//    }
    public List<Book> getListBook(){
        return this.listBooks;}

    @Override
    public String toString() {
        return "BookController{" +
                "listBooks=" + listBooks +
                '}';
    }
}
