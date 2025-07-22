import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    List<Department> departments;

    public University(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDetails() {
        System.out.println("University: " + name);
        System.out.println("\nDepartments:");
        for (Department d : departments) {
            d.displayDetails();
        }
    }
}
