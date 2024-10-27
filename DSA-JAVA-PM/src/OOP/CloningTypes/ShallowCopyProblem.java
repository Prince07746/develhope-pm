package OOP.CloningTypes;

public class ShallowCopyProblem {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person(
                "Prince",
                25,
                new Address("123 Main St", 12345, "Anytown", "USA")
        );
        Person p2 = (Person) p1.clone();

        System.out.println("P1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("=========================================================================");
        p2.setAddress(new Address("456 Main St", 54321, "kampala", "Uganda"));


        System.out.println("P1: " + p1.toString());
        System.out.println("p2: " + p2.toString());


    }
}









class Person implements Cloneable {
    String name;
    int age;
    Address address;
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address.getAddress();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + ", age=" + age + ", address=" + address.getAddress() + '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}





class Address {
    String street;
    int number;
    String city;
    String country;

    public Address(String street, int number, String city, String country) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", city='" + city;
    }
}




