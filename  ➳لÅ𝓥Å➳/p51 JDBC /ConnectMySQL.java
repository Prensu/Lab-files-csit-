import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    public static void main(String[] args) {
        // Include the database name 'world' in the URL
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "prensu17";

        try {
            // Load MySQL JDBC Driver (optional in JDBC 4.0+, but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the 'world' database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database 'world' successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        }
    }
}
