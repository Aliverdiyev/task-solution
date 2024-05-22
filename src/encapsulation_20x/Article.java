package encapsulation_20x;

public class Article {
    private String name;
    private double price;
    private String description;
    private int unitsInStock;
    private boolean inStock;

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

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Article(String name) {
        this(name, 0);
        System.out.println("article 0");
    }

    public Article(String name, double price) {
        this(name, price, "");
        System.out.println("article 1");
    }

    public Article(String name, double price, String description) {
        this(name, price, description, 0);
        System.out.println("article 2");
    }

    public Article(String name, double price, String description, int unitsInStock) {
        this(name, price, description, unitsInStock, true);
        System.out.println("article 3");
    }

    public Article(String name, double price, String description, int unitsInStock, boolean inStock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.unitsInStock = unitsInStock;
        this.inStock = inStock;
        System.out.println("article 4");
    }
}

