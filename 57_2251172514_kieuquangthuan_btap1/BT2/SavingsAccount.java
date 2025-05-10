package BT2;

public class SavingsAccount extends Account {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= 100) {
            return super.withdraw(amount);
        }
        return false;
    }
}