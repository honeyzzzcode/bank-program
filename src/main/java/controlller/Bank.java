package controlller;

import entity.User;

public class Bank {

    private User user;

    public String setActiveUser(User user) {
        this.user = user;
        return "user update successfully";
    }

    public double getUserBalance() {
        return user.getBalance();
    }

    public String creditUser(double amount) {
        double newBalance = user.getBalance() + amount;
        this.user.setBalance(newBalance);
        return amount + " added successfully";
    }
    public String debitUser(double amount){
        double newBalance = user.getBalance() - amount;
        this.user.setBalance(newBalance);
        return amount + "debited";
    }
}
