package encapsulation20x;

public class Car {
    private int registrationNumber;
    private double fuelLevel;
    private String carType;
    private String ownerName;
    private boolean isRunning;

    public Car(int registrationNumber) {
        this(registrationNumber, 0.0);
        System.out.println("car 0");
    }

    public Car(int registrationNumber, double fuelLevel) {
        this(registrationNumber, fuelLevel, "");
        System.out.println("car 1");
    }

    public Car(int registrationNumber, double fuelLevel, String carType) {
        this(registrationNumber, fuelLevel, carType, "");
        System.out.println("car 2");
    }

    public Car(int registrationNumber, double fuelLevel, String carType, String ownerName) {
        this(registrationNumber, fuelLevel, carType, ownerName, true);
        System.out.println("car 3");
    }

    public Car(int registrationNumber, double fuelLevel, String carType, String ownerName, boolean isRunning) {
        this.registrationNumber = registrationNumber;
        this.fuelLevel = fuelLevel;
        this.carType = carType;
        this.ownerName = ownerName;
        this.isRunning = isRunning;
        System.out.println("car 4");
    }

    // Getters and Setters

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}