public class FullTimeEmployee extends Employee{
    private double bonus; 
    private double deduction;

    public FullTimeEmployee(String employeeId, String name, String department, double baseSalary, double bonus, double deduction){
        super(employeeId, name, department, baseSalary);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + bonus - deduction;
    }
}
