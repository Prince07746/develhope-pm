package BankingSystem;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperation {
    String fileName;
    // this is the constructor
    public FileOperation(String fileName) {
        this.fileName = fileName;
    }


    // Save account to file
    public void saveAccount(BankAccount account) {

        ArrayList<SavingsAccount> accounts = new ArrayList<>();
        StringBuilder formatter = new StringBuilder();
        try(FileReader reader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] splitedLine = line.split(",");
                accounts.add(new SavingsAccount(Integer.parseInt(splitedLine[0]),Double.parseDouble(splitedLine[1])));
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

       if(!accounts.isEmpty()){
           boolean isThere = false;
           for(SavingsAccount account1:accounts){
               if(account.equals(account1)){
                   account1.setBalance(account.getBalance());
                   account1.setAccountNumber(account.getAccountNumber());
                   isThere = true;
               }
           }
           if(isThere){
               System.out.println("\t account updated successfully");
           }else{
               accounts.add(new SavingsAccount(account.getAccountNumber(),account.getBalance()));
               System.out.println("\t new Account saved successfully");
           }
       }



       try(FileWriter writer = new FileWriter(fileName)) {
           for(SavingsAccount acc:accounts){
               formatter.append(acc.formatter());
           }
           writer.write(formatter.toString());
           System.out.println("\t Webale");
       } catch (IOException e){
           System.out.println(e.getMessage());
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
