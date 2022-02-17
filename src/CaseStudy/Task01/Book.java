package CaseStudy.Task01;

import java.util.Date;
import java.util.List;

public class Book extends Product {

    private String Publisher;
    private Integer publishYear;
    private String author;
    private Date publishDate;
    private String reprints;

    public List<Book> listBooks;

//    public Book(String productId, String productName, Integer quantity, long unit, String categoryName, List<Book> listBooks) {
//        super(productId, productName, quantity, unit, categoryName);
//        this.listBooks = listBooks;
//    }

    public Book(String productId, String productName, Integer quantity, long unit, String categoryName, Integer publishYear,String publisher,  String author, Date publishDate, String reprints) {
        super(productId, productName, quantity, unit, categoryName);
        Publisher = publisher;
        this.publishYear = publishYear;
        this.author = author;
        this.publishDate = publishDate;
        this.reprints = reprints;
    }

    public Book() {

    }

    @Override
    public String getInformation(String productId) {
        return "Product ID: " + this.getProductId() + "\n Product name: " + this.getProductName() + "\n Quantity: " + this.getCategoryName() + "\n Unit: " + this.getUnit() +
                "\n Category name:" + this.getCategoryName() + "\n Publisher:" + this.getPublisher() + "\n Publishe year: " + this.getPublishYear() + "\n Author: " + this.getAuthor() +
                "\n Publisher date: " + this.getPublishDate() + "\n Reprints: " + this.getReprints();
    }

    @Override
    public double discountPercent(String customer) {

        double percent = 0;

        switch (customer) {
            case "VIP1":
                percent = 0.05f;
                break;
            case "VIP2":
                percent = 0.1f;
                break;
            case "normal":
                percent = 0.02f;
                break;
        }
        return percent;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getReprints() {
        return reprints;
    }

    public void setReprints(String reprints) {
        this.reprints = reprints;
    }

}
