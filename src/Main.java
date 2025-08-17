public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(1, "Alice", "HR"));
        manager.addEmployee(new Employee(2, "Bob", "IT"));

        System.out.println("Employee List:");
        manager.listEmployees();
    }
}
