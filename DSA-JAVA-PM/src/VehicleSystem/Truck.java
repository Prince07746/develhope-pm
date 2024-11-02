package VehicleSystem;


public class Truck extends Vehicle{

    double payLoad;

    public Truck(String model, int year, double payLoad) {
        super(model, year);
        this.payLoad = payLoad;
    }

    @Override
    public String toString(){
        return "Model: "+model+" Year: "+year+" payLoad: "+payLoad;
    }
}
