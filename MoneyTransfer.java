
import java.sql.*;

public class MoneyTransfer {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db")) {
            conn.setAutoCommit(false);

            try {
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
                stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");
                conn.commit();
                System.out.println("Transaction successful.");
            } catch (Exception e) {
                conn.rollback();
                System.out.println("Transaction failed. Rolled back.");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
