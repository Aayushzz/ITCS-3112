import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> studentList;

    public StudentManagementSystem() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student searchStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        System.out.println("All Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
