import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    List<Course> courses;
    List<Instructor> instructors;

    public Department(String name) {
        this.name = name;
        courses = new ArrayList<>();
        instructors = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("Courses:");
        for (Course c : courses) {
            c.displayDetails();
        }
        System.out.println("Instructors:");
        for (Instructor i : instructors) {
            i.displayDetails();
        }
        System.out.println();
    }
}
