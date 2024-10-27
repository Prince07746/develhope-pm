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

        ArrayList<BankAccount> accounts = new ArrayList<>();

        try(FileReader reader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(reader);



        } catch (IOException e){
            System.out.println(e.getMessage());
        }



       try(FileWriter writer = new FileWriter(fileName)) {

           writer.write(account.formatter());

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
