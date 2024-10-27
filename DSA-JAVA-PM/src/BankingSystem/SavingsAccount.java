package BankingSystem;

public class SavingsAccount extends BankAccount {

    private double limitWithdraw;
    private double limitOverDraft;


    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
        this.limitWithdraw = 5000;
        this.limitOverDraft = -300;
    }

    @Override
    public double withdraw(double amount){
         return 0;
    }
    @Override
    public double deposit(double amount) {
        setBalance(amount);
        return getBalance();
    }




}
