package OOP.Inheritance;

public class Inheritance {

    public static void main(String[] args){
        Animal dog = new Dog("johny","French bulldog",0.50,18.7);
        Animal cat = new Cat("whiskers", "Persian", 0.30, 4.5);
        Animal bird = new Bird("tweety", "Canary", 0.10, 0.03);
        Animal rabbit = new Rabbit("thumper", "Dutch rabbit", 0.40, 2.5);

        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(bird.toString());
        System.out.println(rabbit.toString());
    }


}


class Animal{
    String name;
    String type;
    public Animal(String name,String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

class Dog extends Animal{
    double height;
    double weight;
    String breed;
    public Dog(String name,String breed,double height,double weight){
        super(name,"DOG");
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }
    public  void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
class Cat extends Animal{
    double height;
    double weight;
    String breed;
    public Cat(String name,String breed,double height,double weight){
        super(name,"CAT");
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }
    public  void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

class Bird extends Animal{
    double height;
    double weight;
    String breed;
    public Bird(String name,String breed,double height,double weight){
        super(name,"Bird");
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }
    public  void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    @Override
    public String toString() {
        return "Bird{" +
                "height=" + height +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
class Rabbit extends Animal{
    double height;
    double weight;
    String breed;
    public Rabbit(String name,String breed,double height,double weight){
        super(name,"Rabbit");
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }
    public  void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    @Override
    public String toString() {
        return "Rabbit{" +
                "height=" + height +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}