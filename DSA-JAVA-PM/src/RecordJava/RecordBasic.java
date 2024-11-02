package RecordJava;

public class RecordBasic {
    public static void main(String[] args){

        User1 user = new User1("david","Matongo");
        User1 user2 = new User1("david","Matongo");
        System.out.println(user.name());
        System.out.println(user.equals(user2));

    }
}

record User1(String name,String lastName){}
