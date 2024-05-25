package encapsulation_20x;

public class Product {
    private String name;
    private double price;
    private String description;
    private int quantity;
    private boolean inStock;
    public Product(String name) {
        this(name, 0);
        System.out.println("product 0");
    }

    public Product(String name, double price) {
        this(name, price, "");
        System.out.println("product 1");
    }

    public Product(String name, double price, String description) {
        this(name, price, description, 0);
        System.out.println("product 2");
    }

    public Product(String name, double price, String description, int quantity) {
        this(name, price, description, quantity, true);
        System.out.println("product 3");
    }

    public Product(String name, double price, String description, int quantity, boolean inStock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.inStock = inStock;
        System.out.println("product 4");
    }

//    GETTER AND SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}