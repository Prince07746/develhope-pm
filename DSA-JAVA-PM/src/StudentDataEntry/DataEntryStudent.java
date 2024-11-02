package StudentDataEntry;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataEntryStudent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean i = true;
        while (i) {
            System.out.println("\n");
            System.out.print("1. add student \n");
            System.out.print("2. view grades \n");
            System.out.print("3. view average \n");
            System.out.print("4. exit \n");
            System.out.print("enter: ");
            String option = input.nextLine();
            switch (option) {
                case "1":
                    // adding a new student
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter LastName: ");
                    String lastName = input.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = input.nextDouble();

                    try (FileWriter writer = new FileWriter("data.csv")) {
                        String formater = name + "," + lastName + "," + marks;
                        writer.write(formater);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "2":
                    // view grades by calculating
                    try (FileReader reader = new FileReader("data.csv")) {
                        Scanner scanner = new Scanner(reader);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            String[] splitLine = line.split(",");
                            System.out.println(
                                    "name: " + splitLine[0] +
                                    " last-name: " + splitLine[1] +
                                    " marks: " + splitLine[2] +
                                    " Grade: "+ gradingSystem(Double.parseDouble(splitLine[2]))
                            );

                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "3":
                    // view average

                    System.out.println("All student Average: ");
                    break;
                case "4":
                    System.out.println("system will stop coz of wrong value");
                    i = false;
                    break;
            }


        }


    }


    public static char gradingSystem(double grade){
        char grading = 'A';
        if(grade >= 90 && grade <= 100){
            grading = 'A';
        }else if(grade >= 80 && grade <= 89){
            grading = 'B';
        } else if(grade >= 70 && grade <= 79){
            grading = 'C';
        } else if(grade >= 60 && grade <= 69){
            grading = 'D';
        } else  if(grade < 60){
            grading = 'F';
        }
        return grading;
    }

}

