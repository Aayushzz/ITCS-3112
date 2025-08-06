import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PayrollManager manager = new PayrollManager();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Employee Payroll Management ===");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Generate Payslip");
            System.out.println("4. Delete Employee");
            System.out.println("5. Show All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1 -> addFullTimeEmployee();
                    case 2 -> addPartTimeEmployee();
                    case 3 -> generatePayslip();
                    case 4 -> deleteEmployee();
                    case 5 -> manager.showAllEmployees();
                    case 6 -> {
                        System.out.println("Exiting system. Goodbye!");
                        running = false;
                    }
                    default -> System.out.println("Invalid choice. Please enter 1-6.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void addFullTimeEmployee() {
        try {
            System.out.print("ID: ");
            String id = scanner.nextLine().trim();
            System.out.print("Name: ");
            String name = scanner.nextLine().trim();
            System.out.print("Department: ");
            String dept = scanner.nextLine().trim();
            System.out.print("Base Salary: ");
            double base = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Bonus: ");
            double bonus = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Deduction: ");
            double deduct = Double.parseDouble(scanner.nextLine().trim());

            manager.addEmployee(new FullTimeEmployee(id, name, dept, base, bonus, deduct));
            System.out.println("Full-time employee added.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input. Please try again.");
        }
    }

    private static void addPartTimeEmployee() {
        try {
            System.out.print("ID: ");
            String id = scanner.nextLine().trim();
            System.out.print("Name: ");
            String name = scanner.nextLine().trim();
            System.out.print("Department: ");
            String dept = scanner.nextLine().trim();
            System.out.print("Hourly Rate: ");
            double rate = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Hours Worked: ");
            int hours = Integer.parseInt(scanner.nextLine().trim());

            manager.addEmployee(new PartTimeEmployee(id, name, dept, rate, hours));
            System.out.println("Part-time employee added.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input. Please try again.");
        }
    }

    private static void generatePayslip() {
        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine().trim();
        manager.generatePayslip(id);
    }

    private static void deleteEmployee() {
        System.out.print("Enter Employee ID to Delete: ");
        String id = scanner.nextLine().trim();
        manager.deleteEmployee(id);
    }
}
