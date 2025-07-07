package labreport;
import java.sql.*;
public class JDBCPractice {
    public static void deleted(int id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            String s = "DELETE FROM std info WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(s);
            ps.setInt(1, id);

            int r = ps.executeUpdate();

            if (r > 0) {
                System.out.println("DELETED");
            } else {
                System.out.println("ID NOT FOUND");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            System.out.println("CONNECTED SUCCESSFULLY");

            // Inserting data
            String sq = "INSERT INTO std info (name, batch) VALUES (?, ?)"; 
            PreparedStatement ps = conn.prepareStatement(sq);
            ps.setString(1, "Mohima");
            ps.setString(2, "none");
            ps.executeUpdate();
            System.out.println("INSERTED");

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        deleted(3);
    }
}