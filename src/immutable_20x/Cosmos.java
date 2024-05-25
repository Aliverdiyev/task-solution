package immutable_20x;

public final class Cosmos {
    private final String name;
    private final String location;
    private final float size; // Size might be better represented by float or double
    private final float distance; // Distance likely needs float or double
    private final String composition;

    public Cosmos(String name) {
        this(name, "");
        System.out.println("cosmos 0");
    }

    public Cosmos(String name, String location) {
        this(name, location, 0.0f);
        System.out.println("cosmos 1");
    }

    public Cosmos(String name, String location, float size) {
        this(name, location, size, 0.0f);
        System.out.println("cosmos 2");
    }

    public Cosmos(String name, String location, float size, float distance) {
        this(name, location, size, distance, "");
        System.out.println("cosmos 3");
    }

    public Cosmos(String name, String location, float size, float distance, String composition) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.distance = distance;
        this.composition = composition;
        System.out.println("cosmos 4");
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getSize() {
        return size;
    }

    public float getDistance() {
        return distance;
    }

    public String getComposition() {
        return composition;
    }
}

