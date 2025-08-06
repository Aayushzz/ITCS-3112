public class PayrollManager {
    private Payroll payroll;

    public PayrollManager(){
        payroll = new Payroll();
    }

    public void addEmployee(Employee employee){
        payroll.addEmployee(employee);
    }

    public void deleteEmployee(String id) {
        payroll.removeEmployee(id);
    }

    public void generatePayslip(String id) {
        Employee e = payroll.findEmployee(id);
        if (e != null) {
            Payslip payslip = new Payslip(e);
            payslip.printPayslip();
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void showAllEmployees() {
        for (Employee e : payroll.getAllEmployees()) {
            System.out.println(e.getEmployeeId() + " - " + e.getName());
        }
    }
}
