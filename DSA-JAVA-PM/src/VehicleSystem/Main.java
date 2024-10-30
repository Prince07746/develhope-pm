package VehicleSystem;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car("BMW",2023,300);
        Vehicle truck = new Truck("TOYOTA",2013,9000);

        System.out.println(car.toString());
        System.out.println(truck.toString());
    }
}
