package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    // TODO: Implement the LibraryManager class
    private List<Book> books;

    public LibraryManager(){
        books = new ArrayList<>();
    }
    // Method to add a book to the library
    public void addBook(Book book) {
        // TODO: Implement the logic to add a book to the library
        books.add(book);
    }

    // Method to search for books by title
    public List<Book> searchByTitle(String title) {
        // TODO: Implement the logic to search for books by title
        List<Book> result = new ArrayList<>();
        for (Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                result.add(book);
            }
        }
        // Return a list of books that match the title
        return result;
    }

    // Method to update book details
    public boolean updateBookDetails(String title, String newTitle, String newAuthor) {
        // TODO: Implement the logic to update book details
        for (Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                return true;
            }
        }
        // Return true if the book is found and details are updated, false otherwise
        return false;
    }
}
