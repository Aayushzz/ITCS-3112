package Assgn3.Task2;

public abstract class Shape {
    protected int sides;
    
    public Shape(int sides) {
        // Initialize the number of sides
        this.sides = sides;
    }
    
    public abstract double calculateArea();
}
