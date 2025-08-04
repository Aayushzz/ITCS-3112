package com.example.library;

public class Book {
    // TODO: Implement the Book class
    private String title;
    private String author;
    public Book(String title, String author) {
        // TODO: Implement the constructor for Book class
        this.title = title;
        this.author = author;
    }

    // Getters and setters for title and author

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public String setAuthor(String author){
        this.author = author;
    }
}
