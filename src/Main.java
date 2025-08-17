public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();

        dao.addEmployee(new Employee(1, "Alice", "HR"));
        dao.addEmployee(new Employee(2, "Bob", "IT"));

        System.out.println("Employee List from DB:");
        dao.listEmployees();
    }
}
