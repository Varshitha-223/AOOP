import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/fitness_tracker";
        String user = "your_username"; // Replace with your MySQL username
        String password = "your_password"; // Replace with your MySQL password
        return DriverManager.getConnection(url, user, password);
    }
}

