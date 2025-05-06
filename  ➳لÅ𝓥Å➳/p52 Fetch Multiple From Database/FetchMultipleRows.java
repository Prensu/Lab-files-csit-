import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchMultipleRows {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "prensu17"; 

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // Create statement
            Statement stmt = conn.createStatement();

            // Execute query to fetch multiple rows
            String query = "SELECT ID, Name, CountryCode, Population FROM city LIMIT 10";
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result set
            System.out.println("ID\tName\t\tCountry\tPopulation");
            System.out.println("---------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                String countryCode = rs.getString("CountryCode");
                int population = rs.getInt("Population");

                System.out.println(id + "\t" + name + "\t" + countryCode + "\t" + population);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
