package encapsulation20x;

public class Widget {
    private String model;
    private double price;
    private String features;
    private int quantityAvailable;
    private boolean active;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Widget(String model) {
        this(model, 0);
        System.out.println("widget 0");
    }

    public Widget(String model, double price) {
        this(model, price, "");
        System.out.println("widget 1");
    }

    public Widget(String model, double price, String features) {
        this(model, price, features, 0);
        System.out.println("widget 2");
    }

    public Widget(String model, double price, String features, int quantityAvailable) {
        this(model, price, features, quantityAvailable, true);
        System.out.println("widget 3");
    }

    public Widget(String model, double price, String features, int quantityAvailable, boolean active) {
        this.model = model;
        this.price = price;
        this.features = features;
        this.quantityAvailable = quantityAvailable;
        this.active = active;
        System.out.println("widget 4");
    }
}