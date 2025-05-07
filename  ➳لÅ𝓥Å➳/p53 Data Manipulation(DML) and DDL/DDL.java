import java.sql.*;

public class DDL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "prensu17";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Connected to database.");

            // 1. Show first 5 cities
            String query = "SELECT Name, CountryCode, Population FROM city LIMIT 5";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {
                System.out.println("\n🌍 Sample Cities:");
                while (rs.next()) {
                    System.out.println(rs.getString("Name") + " - " +
                                       rs.getString("CountryCode") + " - " +
                                       rs.getInt("Population"));
                }
            }

            // 2. Insert a demo city
            String insert = "INSERT INTO city (Name, CountryCode, District, Population) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insert)) {
                ps.setString(1, "Testville");
                ps.setString(2, "USA");
                ps.setString(3, "DemoDistrict");
                ps.setInt(4, 123456);
                ps.executeUpdate();
                System.out.println("\n✅ Inserted Testville.");
            }

            // 3. Delete the demo city
            String delete = "DELETE FROM city WHERE Name = 'Testville'";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(delete);
                System.out.println("✅ Deleted Testville.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}


//DDL 
// 1)Creating a new table

//DML
//2)Inserting a new record into the table
//3)Updating an existing record in the table    
