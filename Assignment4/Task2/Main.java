public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        system.addStudent(new Student(1, "John"));
        system.addStudent(new Student(2, "Alice"));
        system.displayAllStudents();
        Student found = system.searchStudentById(2);
        if (found != null) {
            System.out.println("Student Found: " + found);
        } else {
            System.out.println("Student not found.");
        }
    }
}
