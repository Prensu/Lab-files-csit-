import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "prensu17"; 
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // DDL: Create table if not exists
            String ddl = "CREATE TABLE IF NOT EXISTS Students (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), age INT)";
            Statement stmt = conn.createStatement();
            stmt.execute(ddl);

            // INSERT using PreparedStatement
            String insertSQL = "INSERT INTO Students (name, age) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, "Alice");
            pstmt.setInt(2, 21);
            pstmt.executeUpdate();

            pstmt.setString(1, "Bob");
            pstmt.setInt(2, 23);
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully using PreparedStatement.");

            // SELECT using PreparedStatement
            String selectSQL = "SELECT * FROM Students WHERE age > ?";
            PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
            selectStmt.setInt(1, 20);
            ResultSet rs = selectStmt.executeQuery();

            System.out.println("Students older than 20:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " + rs.getInt("age"));
            }

            rs.close();
            pstmt.close();
            selectStmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//Prepared Statement is feature of JDBC that allows you to execute parameterized SQL queries.
//It helps to prevent SQL injection attacks and improves performance by pre-compiling the SQL statement.
//PreparedStatement is a subclass of Statement and is used to execute parameterized queries.
//It is used to execute SQL queries with parameters, which can be set at runtime.
