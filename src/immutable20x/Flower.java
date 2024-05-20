package immutable20x;

public final class Flower {
    private final String name;
    private final String species;
    private final String color;
    private final String season;
    private final String fragrance;

    public Flower(String name) {
        this(name, "");
        System.out.println("flower 0");
    }

    public Flower(String name, String species) {
        this(name, species, "");
        System.out.println("flower 1");
    }

    public Flower(String name, String species, String color) {
        this(name, species, color, "");
        System.out.println("flower 2");
    }

    public Flower(String name, String species, String color, String season) {
        this(name, species, color, season, "");
        System.out.println("flower 3");
    }

    public Flower(String name, String species, String color, String season, String fragrance) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.season = season;
        this.fragrance = fragrance;
        System.out.println("flower 4");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getSeason() {
        return season;
    }

    public String getFragrance() {
        return fragrance;
    }
}