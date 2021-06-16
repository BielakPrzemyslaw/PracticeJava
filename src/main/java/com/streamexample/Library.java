package com.streamexample;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).filter(book -> {
            return book.getTitle().startsWith("M");
        }).forEach(System.out::println);

    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Allice Walker", "The color purple"));
        books.add(new Book("Allice Walker", "Meridian"));
        return books;
    }
}
