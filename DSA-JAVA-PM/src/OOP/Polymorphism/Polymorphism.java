package OOP.Polymorphism;

public class Polymorphism {
    public static void main(String[] args){

        Animal animal = new Animal("Animal");
        Animal lion = new Lion();
        Animal cow = new Cow();

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();


    }
}


class Animal{
    // an instance variable animalName
    String animaName;
    // the constructor of animal
    public Animal(String animalName){
        this.animaName = animalName;
    }
    public void  animalSound(){
        System.out.println( animaName+" make sound");
    }

}

class Lion extends Animal{
    // Lion constructor that call the super instance
  public Lion(){
      super("Lion");
  }
  @Override
    public void animalSound(){
      System.out.println(animaName+" roars");
  }
}
class Cow extends Animal{
    // cow constructor that call the super instance
  public Cow(){
      super("Cow");
  }
    @Override
    public void animalSound(){
        System.out.println(animaName+" moos");
    }
}