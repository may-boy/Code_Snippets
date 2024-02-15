package com.practice.interview.java.basic.aggregation;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    // Library contains list of books
    private List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Java Concurrency in Practice", "Brian Goetz");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        Library library = new Library(books);

        List<Book> bks = library.getBooks();
        for(Book bk : bks){
            System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);
        }
    }
}