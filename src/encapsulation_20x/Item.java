package encapsulation_20x;

public class Item {
    private String title;
    private double cost;
    private String details;
    private int stockCount;
    private boolean available;

    public Item(String title) {
        this(title, 0);
        System.out.println("item 0");
    }

    public Item(String title, double cost) {
        this(title, cost, "");
        System.out.println("item 1");
    }

    public Item(String title, double cost, String details) {
        this(title, cost, details, 0);
        System.out.println("item 2");
    }

    public Item(String title, double cost, String details, int stockCount) {
        this(title, cost, details, stockCount, true);
        System.out.println("item 3");
    }

    public Item(String title, double cost, String details, int stockCount, boolean available) {
        this.title = title;
        this.cost = cost;
        this.details = details;
        this.stockCount = stockCount;
        this.available = available;
        System.out.println("item 4");
    }

//    GETTER AND SETTER

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}