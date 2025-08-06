import java.util.*;

public class Payroll {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(String id){
        employees.removeIf(e ->e.getEmployeeId().equals(id));
    }

    public Employee findEmployee(String id){
        for (Employee e : employees){
            if(e.getEmployeeId().equals(id)){
                return e;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }

}
