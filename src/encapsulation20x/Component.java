package encapsulation20x;

public class Component {
    private int partNumber;
    private double price;
    private String function;
    private int stockLevel;
    private boolean active;

    public Component(int partNumber) {
        this(partNumber, 0.0);
        System.out.println("component 0");
    }

    public Component(int partNumber, double price) {
        this(partNumber, price, "");
        System.out.println("component 1");
    }

    public Component(int partNumber, double price, String function) {
        this(partNumber, price, function, 0);
        System.out.println("component 2");
    }

    public Component(int partNumber, double price, String function, int stockLevel) {
        this(partNumber, price, function, stockLevel, true);
        System.out.println("component 3");
    }

    public Component(int partNumber, double price, String function, int stockLevel, boolean active) {
        this.partNumber = partNumber;
        this.price = price;
        this.function = function;
        this.stockLevel = stockLevel;
        this.active = active;
        System.out.println("component 4");
    }

    // ... (Getters and Setters)


    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}