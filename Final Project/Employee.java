public abstract class Employee {
    protected String employeeId;
    protected String name;
    protected String department;
    protected double baseSalary;

    public Employee(String employeeId, String name, String department, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public double  getBaseSalary(){
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void setBaseSalary(double baseSalary) throws IllegalArgumentException{
        if (baseSalary <= 0) throw new IllegalArgumentException("Base salary cannot be less than 1.");
        this.baseSalary = baseSalary;
    }
}
