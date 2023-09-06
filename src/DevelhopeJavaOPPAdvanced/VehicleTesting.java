package DevelhopeJavaOPPAdvanced;

public class VehicleTesting {
    public static void main(String[] args){
        Car car = new Car(8, 4, 50000.4);
        Boat boat = new Boat(122.04, 8000);
        System.out.println("****Car details****");
        car.doVehicleSound();
        car.showVehicleDetails();
        System.out.println("*****Boat Details****");
        boat.doVehicleSound();
        boat.getBoatWeightAndSpeed();
    }
}
