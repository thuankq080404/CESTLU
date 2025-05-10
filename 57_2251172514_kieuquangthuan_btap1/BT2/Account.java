package BT2;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must not be negative.");
        }
        this.balance = initialBalance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
