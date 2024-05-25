package immutable_20x;

public final class Power {
    private final String source;
    private final String type;
    private final String description;
    private final double level; //
    private final String domain; //

    public Power(String source) {
        this(source, "");
        System.out.println("power 0");
    }

    public Power(String source, String type) {
        this(source, type, "");
        System.out.println("power 1");
    }

    public Power(String source, String type, String description) {
        this(source, type, description, 0.0);
        System.out.println("power 2");
    }

    public Power(String source, String type, String description, double level) {
        this(source, type, description, level, "");
        System.out.println("power 3");
    }

    public Power(String source, String type, String description, double level, String domain) {
        this.source = source;
        this.type = type;
        this.description = description;
        this.level = level;
        this.domain = domain;
        System.out.println("power 4");
    }

    // Getters


    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getLevel() {
        return level;
    }

    public String getDomain() {
        return domain;
    }
}

