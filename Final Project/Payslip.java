public class Payslip {
    private Employee employee;
    private double salary;

    public Payslip(Employee employee){
        this.employee = employee;
        this.salary = employee.calculateSalary();
    }

    public void printPayslip() {
        System.out.println("-----------------");
        System.out.println("Payslip for: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: $" + salary);
        System.out.println("-----------------");
    }
}
