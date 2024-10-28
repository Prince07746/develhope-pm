package BankingSystem;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperation {
    public static Path file;

    static {
        file = Paths.get("src",  "BankingSystem","Account.csv").toAbsolutePath();
    }
    String fileName;
    // this is the constructor



    public FileOperation() {
        this.fileName = file.toString();
    }

    // Save account to file
    public void saveAccount(BankAccount account){
        ArrayList <BankAccount> Accounts = new ArrayList<>();
        try(FileReader reader = new FileReader(fileName)){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] lineSpilt = line.split(",");
                Accounts.add(new SavingsAccount(Integer.parseInt(lineSpilt[0]), Double.parseDouble(lineSpilt[1])));
            }


        }catch (IOException E){
            System.out.print("Error :(");
        }
        for (BankAccount account1: Accounts){

            if (account.equals(account1)){
                account1.setAccountNumber(account.getAccountNumber());
                account.setBalance(account.getBalance());
            }
        }
        try(FileWriter writer = new FileWriter(fileName)){
            StringBuilder formatter = new StringBuilder();
            for (BankAccount account1: Accounts){
                formatter.append(account1.formater());
            }
            formatter.delete(0,formatter.length());
            Accounts.clear();

        }catch (IOException E){
            System.out.print("Sorry oooo");
        }


    }




    // Load account from file
    public ArrayList<BankAccount> loadAccount() {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        try (FileReader reader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] parts = line.split(",");
                accounts.add(new SavingsAccount(Integer.parseInt(parts[0]), Double.parseDouble(parts[1])));

            }


        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return accounts;
    }


}
