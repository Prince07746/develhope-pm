package RecordJava;
import java.util.ArrayList;
import java.util.Scanner;


public class RecJava {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        ArrayList<DataBase> dataUsers = new ArrayList<>();
        ArrayList<String> items = new ArrayList<>();
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter password: ");
        String password = input.nextLine();

        boolean process = true;
        while (process){
            System.out.println("1. continue");
            System.out.println("2. stop");
            System.out.println("Enter: ");
            String option = input.nextLine();
            switch (option){
                case "1":
                    System.out.println("Enter item: ");
                    String itemEnter = input.nextLine();
                    items.add(itemEnter);
                    break;
                case "2":
                    process = false;
                    break;
                default:
                    System.out.println("Enter the correct item");
                    break;
            }
        }

        dataUsers.add(new DataBase(new User(name,password),new Item(items)));


        for(DataBase data:dataUsers){
            System.out.println(data.user().toString());
            System.out.println(data.clan());
            System.out.println(data.item().toString());
            System.out.println("-------------------------------");
        }


    }
}



record User(String name,String password){}
record Item(ArrayList<String> content){}

record DataBase(User user,Item item){
    public String clan(){
        return user.name()+"   Mwana wa ndani";
    }
}
