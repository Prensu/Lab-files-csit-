import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class CachedRowSetDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "prensu17";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Name, Population FROM city");

            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(rs); // Fetch data and disconnect

            conn.close(); // You can now work offline with crs

            while (crs.next()) {
                System.out.println(crs.getString("Name") + " - " + crs.getInt("Population"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
