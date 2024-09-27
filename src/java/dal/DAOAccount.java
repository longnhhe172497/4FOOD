/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import entity.Account;
import model.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HOANG LONG
 */
public class DAOAccount extends DBContext {

    //check email ton tai
    public Account getAccountByEmail(String email) {
        String sql = "Select * from [Account] where Email = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getInt(10));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account getAccountById(int AccountID) {
        String sql = "Select * from [Account] where AccountID = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, AccountID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getInt(10));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public void updatePassword(String email, String password) {
        String sql = "UPDATE [dbo].[Account]\n"
                + "   SET [Password] = ?\n"
                + " WHERE [Email] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, password);
            st.setString(2, email);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Account getAccountByUsernameAndPassword(String username, String password) {
        Account acc = null;
        try {
            // SQL query to match username and password in the database
            String sql = "SELECT * FROM Account WHERE Username = ? AND Password = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username); // Set username parameter
            ps.setString(2, password); // Set password parameter
            ResultSet rs = ps.executeQuery();

            // If a record is found, populate the Account object
            if (rs.next()) {
                acc = new Account(
                        rs.getInt("AccountID"),
                        rs.getInt("RoleID"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("FullName"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address"),
                        rs.getInt("StatusID"),
                        rs.getInt("TotalBuyingPoints")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return acc;
    }
}
