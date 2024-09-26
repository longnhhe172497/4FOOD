/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;

/**
 *
 * @author HOANG LONG
 */
public class TokenForgetPassword {
private int id, accountId;
    private boolean isUsed;
    private String token;
    private LocalDateTime expiryTime;

    public TokenForgetPassword() {
    }

    public TokenForgetPassword(int id, int accountId, boolean isUsed, String token, LocalDateTime expiryTime) {
        this.id = id;
        this.accountId = accountId;
        this.isUsed = isUsed;
        this.token = token;
        this.expiryTime = expiryTime;
    }
    public TokenForgetPassword(int accountId, boolean isUsed, String token, LocalDateTime expiryTime) {
        this.accountId = accountId;
        this.isUsed = isUsed;
        this.token = token;
        this.expiryTime = expiryTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExpiryTime(LocalDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public boolean isIsUsed() {
        return isUsed;
    }

    public String getToken() {
        return token;
    }

    public LocalDateTime getExpiryTime() {
        return expiryTime;
    }

    @Override
    public String toString() {
        return "TokenForgetPassword{" + "id=" + id + ", accountId=" + accountId + ", isUsed=" + isUsed + ", token=" + token + ", expiryTime=" + expiryTime + '}';
    }

}
