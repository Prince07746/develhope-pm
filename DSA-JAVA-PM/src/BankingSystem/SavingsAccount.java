package BankingSystem;
import java.util.ArrayList;


public class SavingsAccount extends BankAccount {
    FileOperation file = new FileOperation("Account.csv");
    private double limitWithdraw;
    private double limitOverDraft;


    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
        this.limitWithdraw = 5000;
        this.limitOverDraft = -300;
    }

    @Override
    public double withdraw(int accountNumber ,double amount){
        ArrayList<BankAccount> accounts = file.loadAccount();


    }
    @Override
    public double deposit(int accountNumber, double amount) {
        setBalance(amount);
        return getBalance();
    }




}
