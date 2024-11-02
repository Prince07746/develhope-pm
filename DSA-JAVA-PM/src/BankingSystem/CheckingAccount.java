package BankingSystem;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }


    public String getInfo(){
        return "Balance: " + getBalance()+" | Account Number: " + getAccountNumber()+" | ";
    }

    @Override
    public double withdraw(int accountNumber,double amount) {
        return 0;
    }
    @Override
    public double deposit(int accountNumber,double amount) {
        return 0;
    }


}


