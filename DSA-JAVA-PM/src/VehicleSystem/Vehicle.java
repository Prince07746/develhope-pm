package VehicleSystem;



public class Vehicle implements VehicleInterface {
    String model;
    int year;


    public Vehicle(String model,int year){
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Model: "+model+" Year: "+year;
    }

}
