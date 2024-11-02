package OOP.CloningTypes;

public class ShallowCloning {

   public static void main(String[] args) throws CloneNotSupportedException {
       First f = new First("Prince", "Matongo", 25);

       First f2 = (First) f.clone();

       System.out.println("F "+f.toString());
       System.out.println("F2: "+f2.toString());

       f.setName("john");

       System.out.println("F: "+f.toString());
       System.out.println("F2: "+f2.toString());

       f2.setName("marie");


       System.out.println("F: "+f.toString());
       System.out.println("F2 "+f2.toString());


   }

}



class First implements Cloneable{

    private String name;
    private String lname;
    private int age;
    public First(String name,String lname,int age){
        this.name = name;
        this.lname = lname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nLast Name: " + lname + "\nAge: " + age;
    }
    // we are making here a shallow copy of First meaning object share references to the same instances.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
