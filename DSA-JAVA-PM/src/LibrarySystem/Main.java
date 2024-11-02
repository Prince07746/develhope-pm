package LibrarySystem;
import java.util.Scanner;


public class Main {

    static Library library = new Library();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean process = true;
        while (process){
            System.out.println("1. add new book");
            System.out.println("2. view book");
            System.out.println("3. search book");
            System.out.println("4. delete book");
            System.out.println("5. save to file");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            String option = scanner.nextLine();

            switch (option){
                case "1":
                    System.out.println(" ADD NEW BOOK ");
                    System.out.println("==============");
                    library.addBook();
                    break;
                case "2":
                    System.out.println("  VIEW BOOK ");
                    System.out.println("=============");
                    library.viewBook();
                    break;
                case "3":
                    System.out.println(" SEARCH BOOK ");
                    System.out.println("=============");
                    library.searchBook();
                    break;
                case "4":
                    System.out.println(" DELETE BOOK ");
                    System.out.println("=============");
                    library.deleteBook();
                    break;
                case "5":

                    break;
                case "6":
                    process = false;
                    break;
                default:
                    System.out.println("enter a correct option 1,2,3,4,5 ");
                    break;
            }

        }

    }
}
