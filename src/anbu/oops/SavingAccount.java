package anbu.oops;

public class SavingAccount extends Account {

    private static final double INTEREST_RATE = 4.0; // 4% Interest

    public SavingAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber,accountHolderName,balance);
    }

    @Override
    public double calculateInterest(){
        return (balance * INTEREST_RATE/100);
    }

    @Override
    public void displayAccountType(){
        System.out.println("This is Saving Account.");
    }
}
