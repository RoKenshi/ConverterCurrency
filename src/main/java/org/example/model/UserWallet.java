package org.example.model;

public class UserWallet {
    private int balance;
    private String typeQouter;

    public UserWallet() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getTypeQouter() {
        return typeQouter;
    }

    public void setTypeQouter(String typeQouter) {
        this.typeQouter = typeQouter;
    }
}
