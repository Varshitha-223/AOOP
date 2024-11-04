import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (Connection connection = DatabaseUtil.getConnection()) {
            // Your logic for user registration or login using the connection
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL exception (e.g., send an error response)
        }
    }
}
