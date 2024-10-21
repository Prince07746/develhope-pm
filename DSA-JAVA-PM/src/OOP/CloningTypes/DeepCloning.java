package OOP.CloningTypes;

public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Original o = new Original("Prince", "Matongo", 25);
        Original o2 = (Original) o.clone();
        System.out.println("Original: " + o.toString());
        System.out.println("Original2: " + o2.toString());
        o.setName("John");
        o.setLname("Doe");
        o.setAge(26);
        System.out.println("Original: " + o.toString());
        System.out.println("Original2: " + o2.toString());
        o2.setName("Marie");
        o2.setLname("Doe");
        o2.setAge(26);
        System.out.println("Original: " + o.toString());
        System.out.println("Original2: " + o2.toString());
    }
}




class Original implements Cloneable{
    String name;
    String lname;
    int age;

    public Original(String name, String lname, int age) {
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
        return "Original{ Name: " + name + " Lastname: " + lname + " Age: " + age + "}";
    }

    @Override
    protected Object clone() throws  CloneNotSupportedException{
        Original original = (Original) super.clone();
        original.setAge(this.getAge());
        return original;
    }

}
