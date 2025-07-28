package Assgn3.Task3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Smith");
        Magazine magazine = new Magazine("Science Today", "National Geographic");
        
        // Display book information
        System.out.println("Book Information: ");
        book.displayInfo();
        System.out.println("");
        // Display magazine information
        System.out.println("Magazine Information:");
        magazine.displayInfo();
    }
}

