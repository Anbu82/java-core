package anbu.oops;

public class CurrentAccount extends Account{

    private static final double INTEREST_RATE= 2;// Interest rate 2%

    public CurrentAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber,accountHolderName,balance);
    }

    @Override
    public double calculateInterest(){
        return (balance * INTEREST_RATE/100);
    }

    @Override
    public void displayAccountType(){
        System.out.println("This is Current Account.");
    }
}
