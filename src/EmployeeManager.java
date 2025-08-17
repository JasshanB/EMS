import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void listEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
