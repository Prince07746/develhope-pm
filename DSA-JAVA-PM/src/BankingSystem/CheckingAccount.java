package BankingSystem;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }


    public String getInfo(){
        return "Balance: " + getBalance()+" | Account Number: " + getAccountNumber()+" | ";
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }
    @Override
    public double deposit(double amount) {
        return 0;
    }


}


