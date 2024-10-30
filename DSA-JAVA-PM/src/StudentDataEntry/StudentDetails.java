package StudentDataEntry;

public class StudentDetails {
    private String name;
    private String lastName;
    private double marks;
    private char grade;
    private String classRoom;

    public StudentDetails(String name, String lastName, double marks,String classRoom) {
        this.name = name;
        this.lastName = lastName;
        this.marks = marks;
        this.grade = gradingSystem(marks);
        this.classRoom = classRoom;
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

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
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

    @Override
    public String toString() {
        return "name='" + name+
                "| lastName='" + lastName +
                "| marks=" + marks +
                "| grade=" + grade +
                "| classRoom='" + classRoom+"]";
    }

}
