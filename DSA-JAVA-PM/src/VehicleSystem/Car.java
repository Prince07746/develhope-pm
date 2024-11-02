package VehicleSystem;

public class Car extends Vehicle{
    int trunk;
    public Car(String model, int year, int trunk) {
        super(model, year);
        this.trunk = trunk;
    }
    @Override
    public String toString(){
        return  "Model: "+model+" Year: "+year+" trunk: "+trunk;
    }
}
