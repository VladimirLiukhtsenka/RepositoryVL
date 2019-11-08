package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO9;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int pagequantity;
    private int cost;
    private String bindingType;

    public Book(int id, String name, String author, String publishingHouse, int yearOfPublishing, int pagequantity, int cost, String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.pagequantity = pagequantity;
        this.cost = cost;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getPagequantity() {
        return pagequantity;
    }

    public void setPagequantity(int pagequantity) {
        this.pagequantity = pagequantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", pagequantity=" + pagequantity +
                ", cost=" + cost +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                yearOfPublishing == book.yearOfPublishing &&
                pagequantity == book.pagequantity &&
                cost == book.cost &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(bindingType, book.bindingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publishingHouse, yearOfPublishing, pagequantity, cost, bindingType);
    }
}
