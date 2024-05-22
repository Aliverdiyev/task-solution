package immutable_20x;

public final class Dress {
    private final String brand;
    private final String style;
    private final String size;
    private final String color;
    private final String fabric;

    public Dress(String brand) {
        this(brand, "");
        System.out.println("dress 0");
    }

    public Dress(String brand, String style) {
        this(brand, style, "");
        System.out.println("dress 1");
    }

    public Dress(String brand, String style, String size) {
        this(brand, style, size, "");
        System.out.println("dress 2");
    }

    public Dress(String brand, String style, String size, String color) {
        this(brand, style, size, color, "");
        System.out.println("dress 3");
    }

    public Dress(String brand, String style, String size, String color, String fabric) {
        this.brand = brand;
        this.style = style;
        this.size = size;
        this.color = color;
        this.fabric = fabric;
        System.out.println("dress 4");
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getStyle() {
        return style;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getFabric() {
        return fabric;
    }
}

