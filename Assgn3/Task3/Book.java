package Assgn3.Task3;

public class Book extends LibraryItem {
    public Book(String title, String author) {
        super(title, author);
    }
    public void displayInfo() {
        // Display book title and author
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

