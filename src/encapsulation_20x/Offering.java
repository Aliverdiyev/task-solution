package encapsulation_20x;

public class Offering {
    private String name;
    private double rate;
    private String description;
    private int capacity;
    private boolean available;

    public Offering(String name) {
        this(name, 0.0);
        System.out.println("offering 0");
    }

    public Offering(String name, double rate) {
        this(name, rate, "");
        System.out.println("offering 1");
    }

    public Offering(String name, double rate, String description) {
        this(name, rate, description, 0);
        System.out.println("offering 2");
    }

    public Offering(String name, double rate, String description, int capacity) {
        this(name, rate, description, capacity, true);
        System.out.println("offering 3");
    }

    public Offering(String name, double rate, String description, int capacity, boolean available) {
        this.name = name;
        this.rate = rate;
        this.description = description;
        this.capacity = capacity;
        this.available = available;
        System.out.println("offering 4");
    }

    // ... (Getters and Setters)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}