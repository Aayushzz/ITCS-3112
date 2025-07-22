public class Main {
    public static void main(String[] args) {
        // Create university
        University uni = new University("XYZ University");

        // Create departments
        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");

        // Create courses for CS
        Course cse101 = new Course("CSE101");
        Course cse201 = new Course("CSE201");
        cs.addCourse(cse101);
        cs.addCourse(cse201);

        // Create instructors for CS
        Instructor john = new Instructor("John Doe");
        Instructor jane = new Instructor("Jane Smith");
        cs.addInstructor(john);
        cs.addInstructor(jane);

        // Create courses for Math
        Course mat101 = new Course("MAT101");
        Course mat201 = new Course("MAT201");
        math.addCourse(mat101);
        math.addCourse(mat201);

        // Create instructors for Math
        Instructor david = new Instructor("David Johnson");
        Instructor emily = new Instructor("Emily Brown");
        math.addInstructor(david);
        math.addInstructor(emily);

        // Add departments to university
        uni.addDepartment(cs);
        uni.addDepartment(math);

        // Display university details
        uni.displayDetails();
    }
}
