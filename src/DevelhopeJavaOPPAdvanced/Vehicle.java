package DevelhopeJavaOPPAdvanced;

public abstract class Vehicle {
    String vehicleType;
    private int numberOfWheels;
    public Vehicle(String vehicle_type, int wheels){
        this.numberOfWheels = wheels;
        this.vehicleType = vehicle_type;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public String showVehicleDetails(){
        return String.format("car type: %s%n number of wheels: %d", vehicleType, getNumberOfWheels());
    }
    public abstract void doVehicleSound();
}
class Car extends Vehicle{
    int numberOfDoors;
    double carPrice;
    public Car(int numberOfWheels, int doors, double price) {
        super("car", numberOfWheels);
        this.carPrice = price;
        this.numberOfDoors = doors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getCarPrice() {
        return carPrice;
    }

    @Override
    public String showVehicleDetails(){
        super.showVehicleDetails();
        String carDetails = String.format("number of doors: %d%n Price of Car: %.2f", getNumberOfDoors(), getCarPrice());
        System.out.println(carDetails);
        return carDetails;
    }
    @Override
    public void doVehicleSound(){
        System.out.println("cars makes this sound:  prrrprrrr");
    }
}
class Boat extends Vehicle{
    private int boatKilosWeight;
    private double maxKnotsSpeed;

    public int getBoatKilosWeight() {
        return boatKilosWeight;
    }
    public double getMaxKnotsSpeed() {
        return maxKnotsSpeed;
    }
    public Boat(double maxSpeed, int weight) {
        super("Boat", 0);
        maxKnotsSpeed = maxSpeed;
        boatKilosWeight = weight;
    }
    @Override
    public void doVehicleSound(){
        System.out.println("Boat makes mmiiiimmiii sound");
    }
    public String getBoatWeightAndSpeed(){
        String boatDetails = String.format("total kilos weight: %d kgs%n maximum knots speed: %.2f knots", getBoatKilosWeight(), getMaxKnotsSpeed());
        System.out.println(boatDetails);
        return boatDetails;
    }
}
