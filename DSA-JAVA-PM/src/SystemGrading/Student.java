package SystemGrading;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {

    public  static ArrayList<StudentIdentity> students = new ArrayList<>();

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean i = true;
        while (i){
            System.out.println("\n");
            System.out.print("1. add student \n");
            System.out.print("2. view grades \n");
            System.out.print("3. view average \n");
            System.out.print("4. exit \n");
            System.out.print("enter: ");
            String option = input.nextLine();
            switch (option){
                case "1":
                    // adding a new student
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter LastName: ");
                    String lastName = input.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = input.nextDouble();
                    addStudent(name,lastName,marks);
                    input.nextLine();
                    break;
                case "2":
                    // view grades by calculating
                    for(StudentIdentity identity:students){
                        System.out.println(identity.toString());
                    }
                    break;
                case "3":
                    // view average
                    double marksAv = 0;
                    for(StudentIdentity identity:students){
                        marksAv += identity.getMarks();
                    }
                    System.out.println("All student Average: "+marksAv/students.size());
                    break;
                case "4":
                    System.out.println("system will stop coz of wrong value");
                    i = false;
                    break;
            }


        }




    }

    public static void addStudent(String name,String lastName,double marks){
        students.add(new StudentIdentity(name,lastName,marks,gradingSystem(marks)));
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



class StudentIdentity{
    String name;
    String lastName;
    double marks;
    char grade;
    public StudentIdentity(String name,String lastName,double marks,char grade){
        this.name = name;
        this.lastName = lastName;
        this.marks = marks;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\n name=" + name +
                " |lastName=" + lastName+
                " |Marks=" + marks+
                " |Grade="+grade;
    }
}