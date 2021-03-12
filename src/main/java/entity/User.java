package entity;

import controlller.Bank;

public class User extends Bank {

    public String account;
    private double balance;
    public String name;
    public String gender;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User(String account, String name, double balance, String gender) {
        this.account = account;
        this.name = name;
        this.balance = balance;
        this.gender = gender;
    }


}
