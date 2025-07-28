package Assgn3.Task3;

public class Magazine extends LibraryItem {
    private String publisher;
    
    public Magazine(String title, String publisher) {
        super(title, "");
        // Initialize publisher
        this.publisher = publisher;
    }
    
    public void displayInfo() {
        // Display magazine title and publisher
        System.out.println("Title: " + title);
        System.out.println("Author: ");
        System.out.println("Publisher: " + publisher);
    }
}

