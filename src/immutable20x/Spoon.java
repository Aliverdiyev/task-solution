package immutable20x;

public final class Spoon {
    private final String material;
    private final String style;
    private final double length;
    private final String finish;
    private final String pattern;

    public Spoon(String material) {
        this(material, "");
        System.out.println("spoon 0");
    }

    public Spoon(String material, String style) {
        this(material, style, 0.0);
        System.out.println("spoon 1");
    }

    public Spoon(String material, String style, double length) {
        this(material, style, length, "");
        System.out.println("spoon 2");
    }

    public Spoon(String material, String style, double length, String finish) {
        this(material, style, length, finish, "");
        System.out.println("spoon 3");
    }

    public Spoon(String material, String style, double length, String finish, String pattern) {
        this.material = material;
        this.style = style;
        this.length = length;
        this.finish = finish;
        this.pattern = pattern;
        System.out.println("spoon 4");
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public String getStyle() {
        return style;
    }

    public double getLength() {
        return length;
    }

    public String getFinish() {
        return finish;
    }

    public String getPattern() {
        return pattern;
    }
}