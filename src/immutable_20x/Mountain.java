package immutable_20x;

public final class Mountain {
    private final String name;
    private final String range;
    private final double elevation;
    private final String location;
    private final String difficulty;

    public Mountain(String name) {
        this(name, "");
        System.out.println("mountain 0");
    }

    public Mountain(String name, String range) {
        this(name, range, 0.0);
        System.out.println("mountain 1");
    }

    public Mountain(String name, String range, double elevation) {
        this(name, range, elevation, "");
        System.out.println("mountain 2");
    }

    public Mountain(String name, String range, double elevation, String location) {
        this(name, range, elevation, location, "");
        System.out.println("mountain 3");
    }

    public Mountain(String name, String range, double elevation, String location, String difficulty) {
        this.name = name;
        this.range = range;
        this.elevation = elevation;
        this.location = location;
        this.difficulty = difficulty;
        System.out.println("mountain 4");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRange() {
        return range;
    }

    public double getElevation() {
        return elevation;
    }

    public String getLocation() {
        return location;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
