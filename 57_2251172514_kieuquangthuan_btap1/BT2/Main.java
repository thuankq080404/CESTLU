package BT2;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        
        System.out.println("Attempting to withdraw 300...");
        boolean firstWithdraw = sa.withdraw(300);
        System.out.println("Withdraw successful: " + firstWithdraw);
        System.out.println("Balance after first withdraw: " + sa.getBalance());

        System.out.println("Attempting to withdraw another 300...");
        boolean secondWithdraw = sa.withdraw(300);
        System.out.println("Withdraw successful: " + secondWithdraw);
        System.out.println("Balance after second withdraw: " + sa.getBalance());
    }
}

