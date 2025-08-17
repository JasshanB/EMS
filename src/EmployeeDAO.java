import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    public void addEmployee(Employee e) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO employees (first_name, department, email) VALUES (?, ?, ?)")) {

            stmt.setString(1, e.getName());            stmt.setString(2, e.getDepartment());
            stmt.setString(3, e.getName().toLowerCase() + "@company.com");

            stmt.executeUpdate();
            System.out.println("Employee added to DB!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void listEmployees() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            while (rs.next()) {
                System.out.println(rs.getInt("emp_id") + " - " +
                                   rs.getString("first_name") + " (" +
                                   rs.getString("department") + ")");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
