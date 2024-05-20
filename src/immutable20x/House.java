package immutable20x;

public final class House {
    private final String address;
    private final double squareFootage;
    private final String type;
    private final String ownerName;
    private final boolean isOccupied;

    public House(String address) {
        this(address, 0.0);
        System.out.println("house 0");
    }

    public House(String address, double squareFootage) {
        this(address, squareFootage, "");
        System.out.println("house 1");
    }

    public House(String address, double squareFootage, String type) {
        this(address, squareFootage, type, "");
        System.out.println("house 2");
    }

    public House(String address, double squareFootage, String type, String ownerName) {
        this(address, squareFootage, type, ownerName, true);
        System.out.println("house 3");
    }

    public House(String address, double squareFootage, String type, String ownerName, boolean isOccupied) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.type = type;
        this.ownerName = ownerName;
        this.isOccupied = isOccupied;
        System.out.println("house 4");
    }

    // Getters
    public String getAddress() {
        return address;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public String getType() {
        return type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}