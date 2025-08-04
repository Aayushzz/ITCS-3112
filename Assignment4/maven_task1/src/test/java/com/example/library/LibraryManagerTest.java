package com.example.library;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class LibraryManagerTest {
    private LibraryManager libraryManager;

    @Before
    public void setUp() {
        libraryManager = new LibraryManager();

        // Add some initial books
        libraryManager.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        libraryManager.addBook(new Book("1984", "George Orwell"));
    }

    @Test
    public void testAddBook() {
        Book newBook = new Book("To Kill a Mockingbird", "Harper Lee");
        libraryManager.addBook(newBook);

        List<Book> found = libraryManager.searchByTitle("To Kill a Mockingbird");
        assertEquals("Should find one matching book", 1, found.size());
        assertEquals("Author should match", "Harper Lee", found.get(0).getAuthor());
    }

    @Test
    public void testSearchByTitle() {
        List<Book> results = libraryManager.searchByTitle("The Hobbit");

        assertFalse("Search should not return empty", results.isEmpty());
        assertEquals("Should match correct author", "J.R.R. Tolkien", results.get(0).getAuthor());
    }

    @Test
    public void testUpdateBookDetails() {
        boolean updated = libraryManager.updateBookDetails("1984", "Nineteen Eighty-Four", "G. Orwell");

        assertTrue("Update should succeed", updated);

        List<Book> updatedBooks = libraryManager.searchByTitle("Nineteen Eighty-Four");
        assertEquals("Should find updated book", 1, updatedBooks.size());
        assertEquals("Updated author should match", "G. Orwell", updatedBooks.get(0).getAuthor());
    }

    @Test
    public void testUpdateBookDetailsNonExistingBook() {
        boolean updated = libraryManager.updateBookDetails("Nonexistent Book", "New Title", "New Author");

        assertFalse("Update should fail for non-existing book", updated);
    }
}
