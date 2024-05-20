package immutable20x;

public final class Wall {
    private final String material;
    private final String color;
    private final double height;
    private final double width;
    private final String texture;

    public Wall(String material) {
        this(material, "");
        System.out.println("wall 0");
    }

    public Wall(String material, String color) {
        this(material, color, 0.0);
        System.out.println("wall 1");
    }

    public Wall(String material, String color, double height) {
        this(material, color, height, 0.0);
        System.out.println("wall 2");
    }

    public Wall(String material, String color, double height, double width) {
        this(material, color, height, width, "");
        System.out.println("wall 3");
    }

    public Wall(String material, String color, double height, double width, String texture) {
        this.material = material;
        this.color = color;
        this.height = height;
        this.width = width;
        this.texture = texture;
        System.out.println("wall 4");
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getTexture() {
        return texture;
    }
}