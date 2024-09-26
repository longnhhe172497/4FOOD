/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HOANG LONG
 */
public class Account {

    private int accountId;
    private int roleId;
    private String username, password, fullName, email, phone, address;
    private int statusId;
    private int totalbyingPoints;

    public Account(int aInt, int aInt1, String string, String string1, String string2, String string3, String string4, String string5, String string6, int aInt2, int aInt3) {
    }

    public Account(int accountId, int roleId, String username, String password, String fullName, String email, String phone, String address, int statusId, int totalbyingPoints) {
        this.accountId = accountId;
        this.roleId = roleId;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.statusId = statusId;
        this.totalbyingPoints = totalbyingPoints;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public void setTotalbyingPoints(int totalbyingPoints) {
        this.totalbyingPoints = totalbyingPoints;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getStatusId() {
        return statusId;
    }

    public int getTotalbyingPoints() {
        return totalbyingPoints;
    }

    @Override
    public String toString() {
        return "Account{" + "accountId=" + accountId + ", roleId=" + roleId + ", username=" + username + ", password=" + password + ", fullName=" + fullName + ", email=" + email + ", phone=" + phone + ", address=" + address + ", statusId=" + statusId + ", totalbyingPoints=" + totalbyingPoints + '}';
    }

}
