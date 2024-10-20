package OOP.InterfacesJava;

public class Interface1 {
    public static void main(String[] args){

        CollegePerson student = new Student("Prince","Matongo","67464654",2024);
        student.goToCollege();
        CollegePerson professor = new Professor("david","kitoko","87464744","Java advanced");
        professor.goToCollege();
        CollegePerson assistant = new Assistant("sarah","alberta","1123218",true);
        assistant.goToCollege();

        ((Student) student).studyAtHome();
        ((Professor)professor).teachToOtherPeople();
        ((Assistant)assistant).studyAtHome();


    }



}



interface LearningPerson{
 public void studyAtHome();
}
interface TeachingPerson{
 public void teachToOtherPeople();
}



class CollegePerson{
    String name;
    String surname;
    String collegeId;
    public CollegePerson(String name, String surname, String collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }
    public void goToCollege() {
        System.out.println("Name: " + name + " Surname: " + surname + " CollegeId: " + collegeId);
    }

}

class Student extends CollegePerson implements LearningPerson{
    int academicYear;
    public Student(String name, String surname, String collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }
    @Override
    public void studyAtHome() {
        System.out.println(name+": I study at home");
    }

}
class Professor extends CollegePerson implements TeachingPerson{
    String teachingSubject;
    public Professor(String name, String surname, String collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }
    @Override
    public void teachToOtherPeople() {
        System.out.println(name+": I teach to other people");
    }
}


class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{
    boolean isGoingToBeAPhD;
    public Assistant(String name, String surname, String collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void teachToOtherPeople(){
        System.out.println(name+": I teach to other people");
    }
   @Override
   public void studyAtHome(){
       System.out.println(name+": I study at home");
   }

}