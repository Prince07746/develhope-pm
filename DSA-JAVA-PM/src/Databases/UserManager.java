package Databases;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserManager {
    public static Path fileloc;
    static {
        fileloc = Paths.get("src","Databases","db.txt").toAbsolutePath();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Client us1 = new Client();
        int a = 0;
        while (a < 20){
            System.out.println("\t 1. view users ");
            System.out.println("\t 2. add a user ");
            System.out.println("\t 3. Delete a user ");
            System.out.println("\t 4. Exit ");
            System.out.print("\t Enter: ");
            String option = input.nextLine();
            switch (option){
                case "1":
                    int counter = 0;
                    for(User user:us1.getAllUsers()){
                        counter++;
                        System.out.println("\t["+counter+"]"+user.toString());
                    }
                    break;
                case "2":
                    System.out.print("\t Name: ");
                    String name = input.nextLine();
                    System.out.print("\t Last Name: ");
                    String lastName = input.nextLine();
                    us1.save(name,lastName,"USER");
                    break;
                case "3":
                    System.out.print("\t Enter name: ");
                    String nameToDelete = input.nextLine();
                    us1.delete(nameToDelete);
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t you entered a bad value exit..");
                    break;
            }
            a++;
        }




    }

}
