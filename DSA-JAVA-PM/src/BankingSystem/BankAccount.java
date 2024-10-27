package BankingSystem;
import java.io.Serializable;


abstract public class BankAccount implements Serializable {
  private int accountNumber;
  private double balance;

  public BankAccount(int accountNumber,double balance){
      this.accountNumber = accountNumber;
      this.balance = balance;
  }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract public double withdraw(double amount);
    abstract public double deposit(double amount);

    public String formatter() {
        return getBalance() + "," + getAccountNumber();
    }

}



//3. Banking System
//Concepts: Interfaces, abstract classes, inheritance, file operations.
//Description:
//Define an abstract class BankAccount with common attributes like accountNumber, balance, and abstract methods like withdraw() and deposit().
//Create subclasses like SavingsAccount and CheckingAccount, implementing specific behaviors for withdrawal limits or overdrafts.
//Use an interface Serializable to save and load account details to and from a file.
//Implement file operations to store customer account data and retrieve it when needed.








