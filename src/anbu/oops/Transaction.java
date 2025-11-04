package anbu.oops;

public class Transaction {
    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        System.out.println("\n--- Transaction Initiated ---");
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transaction Successful: " + amount + " transferred.");
        } else {
            System.out.println("Transaction Failed: Insufficient funds!");
        }
        System.out.println("--- Transaction Completed ---\n");
    }
}
