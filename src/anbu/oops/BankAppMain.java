package anbu.oops;

import java.util.Scanner;

public class BankAppMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to Anbu Bank ");

        // Customer details
        System.out.print("Enter Customer ID: ");
        String custId = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String custName = sc.nextLine();

        Customer customer = new Customer(custId, custName);

        // Account type
        System.out.println("\nSelect Account Type:");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Account account;
        if (choice == 1) {
            account = new SavingAccount("S" + custId, custName, initialBalance);
        } else {
            account = new CurrentAccount("C" + custId, custName, initialBalance);
        }

        // Display account details
        System.out.println("\n" + customer);
        account.displayAccountType();
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit
        System.out.print("\nEnter amount to deposit: ");
        double depositAmt = sc.nextDouble();
        account.deposit(depositAmt);

        // Withdraw
        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        account.withdraw(withdrawAmt);

        // Interest
        System.out.println("\nInterest on your account: " + account.calculateInterest());
        System.out.println("Final Balance: " + account.getBalance());

        System.out.println("\nThank you for banking with us, " + custName + "!");
        sc.close();
    }
}
