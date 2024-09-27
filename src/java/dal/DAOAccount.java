package dal;

import entity.Account;
import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HOANG LONG
 */
public class DAOAccount extends DBContext {

    // Check if the email exists
    public Account getAccountByEmail(String email) {
        String sql = "SELECT * FROM [Account] WHERE Email = ?";

        try (Connection conn = DBContext.getConnection(); // Use the static method to get connection
                 PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Account(
                        rs.getInt("AccountID"),
                        rs.getInt("RoleID"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("FullName"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address"),
                        rs.getInt("StatusID"),
                        rs.getInt("TotalBuyingPoints"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions
        }
        return null;
    }

    // Get account by AccountID
    public Account getAccountById(int accountId) {
        String sql = "SELECT * FROM [Account] WHERE AccountID = ?";

        try (Connection conn = DBContext.getConnection(); // Use the static method to get connection
                 PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, accountId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Account(
                        rs.getInt("AccountID"),
                        rs.getInt("RoleID"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("FullName"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address"),
                        rs.getInt("StatusID"),
                        rs.getInt("TotalBuyingPoints"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions
        }
        return null;
    }

    // Update the password for an account
    public void updatePassword(String email, String password) {
        String sql = "UPDATE [dbo].[Account] SET [Password] = ? WHERE [Email] = ?";
        try (Connection conn = DBContext.getConnection(); // Use the static method to get connection
                 PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, password);
            st.setString(2, email);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions
        }
    }

    // Get account by username and password
    public Account getAccountByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM [Account] WHERE Username = ? AND Password = ?";
        try (Connection conn = DBContext.getConnection(); // Use the static method to get connection
                 PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Account(
                        rs.getInt("AccountID"),
                        rs.getInt("RoleID"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("FullName"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address"),
                        rs.getInt("StatusID"),
                        rs.getInt("TotalBuyingPoints"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions
        }
        return null;
    }

    // Create a new account
    public boolean createAccount(Account account) {
        String sql = "INSERT INTO Account (RoleID, Username, Password, FullName, Email, Phone, Address, StatusID, TotalBuyingPoints) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBContext.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, account.getRoleId());
            ps.setString(2, account.getUsername());
            ps.setString(3, account.getPassword());
            ps.setString(4, account.getFullName());
            ps.setString(5, account.getEmail());
            ps.setString(6, account.getPhone());
            ps.setString(7, account.getAddress());
            ps.setInt(8, account.getStatusId());
            ps.setInt(9, account.getTotalbyingPoints());

            int rowsAffected = ps.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected); // Log how many rows were affected
            return rowsAffected > 0; // Return true if the insert was successful
        } catch (SQLException e) {
            e.printStackTrace(); // Log the exception
            return false; // Return false if an error occurred
        }
    }
}
