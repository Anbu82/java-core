package anbu.oops;

public abstract class Account implements InterestPayable {

    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Common method for deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + ", New Balance: " + balance);
    }

    // Common method for withdrawal
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Abstract method to be implemented by child classes
    public abstract void displayAccountType();
}
