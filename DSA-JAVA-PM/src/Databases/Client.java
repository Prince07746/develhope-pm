package Databases;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    ArrayList<User> users = new ArrayList<>();
    StringBuilder formater = new StringBuilder();
    String status;

    public Client() {
        users = getAllUsers();
    }

    public ArrayList<User> getAllUsers() {
        try (
                FileReader reader = new FileReader(UserManager.fileloc.toString());
        ) {
            users.clear();

            Scanner line = new Scanner(reader);
            while (line.hasNextLine()) {
                String nLine = line.nextLine();
                String[] splited = nLine.split(",");
                users.add(new User(splited[0], splited[1], splited[2]));
            }
            if (users.isEmpty()) {
                System.out.println("\t no user in the file");
            }
            line.close();
        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
        return users;
    }


    public void save(String name, String lastName, String status) {
        try (
                FileReader reader = new FileReader(UserManager.fileloc.toString())
        ) {
            users.clear();
            formater.delete(0,formater.length());

            Scanner reading = new Scanner(reader);
            boolean checker = true;
            while (reading.hasNextLine()){
                String nextL = reading.nextLine();
                String[] spliter = nextL.split(",");
                if(!spliter[0].equals(name)){
                    users.add(new User(spliter[0],spliter[1],spliter[2]));
                }
                else if(spliter[0].equals(name)){
                    checker = false;
                }
            }

            if(checker){
                try(FileWriter writer = new FileWriter(UserManager.fileloc.toString())) {
                    for (User user : users) {
                        formater.append(user.getName() + ",").append(user.getLastName() + ",").append(user.getStatus() + "\n");
                    }
                   formater.append(name + ",").append(lastName + ",").append(status + "\n");

                    writer.write(formater.toString());
                    writer.close();
                    System.out.println("\t user registered");
                    formater.delete(0,formater.length());
                    users.clear();
                }
            }else{
                System.out.println("\t user "+name+" exist in the Database change the name");
                formater.delete(0,formater.length());
                users.clear();
            }


        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }


    public void delete(String name){
        try (FileReader reader = new FileReader(UserManager.fileloc.toString())){
            users.clear();
            formater.delete(0,formater.length());

            Scanner reading = new Scanner(reader);
            boolean checker = false;
            while (reading.hasNextLine()){
                String nextL = reading.nextLine();
                String[] spliter = nextL.split(",");
                if(!spliter[0].equals(name)){
                    users.add(new User(spliter[0],spliter[1],spliter[2]));
                }
                else if(spliter[0].equals(name)){
                    checker = true;
                }

            }

            reading.close();
            reader.close();
            if(checker){
                try( FileWriter writer = new FileWriter(UserManager.fileloc.toString())){
                    for(User user:users){
                        formater.append(user.getName()+",").append(user.getLastName()+",").append(user.getStatus()+"\n");
                    }
                    writer.write(formater.toString());
                    writer.close();
                    System.out.println("\t user "+name+" Deleted successfuly");
                    formater.delete(0,formater.length());
                    users.clear();
                }
            }else{
                System.out.println("\t User "+name+" not in the Database");
                formater.delete(0,formater.length());
                users.clear();
            }



        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}