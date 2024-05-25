package encapsulation_20x;

public class World {
    private String name;
    private double size;
    private String type;
    private String dominantSpecies;
    private boolean hasAtmosphere;

    public World(String name) {
        this(name, 0.0);
        System.out.println("world 0");
    }

    public World(String name, double size) {
        this(name, size, "");
        System.out.println("world 1");
    }

    public World(String name, double size, String type) {
        this(name, size, type, "");
        System.out.println("world 2");
    }

    public World(String name, double size, String type, String dominantSpecies) {
        this(name, size, type, dominantSpecies, false);
        System.out.println("world 3");
    }

    public World(String name, double size, String type, String dominantSpecies, boolean hasAtmosphere) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.dominantSpecies = dominantSpecies;
        this.hasAtmosphere = hasAtmosphere;
        System.out.println("world 4");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDominantSpecies() {
        return dominantSpecies;
    }

    public void setDominantSpecies(String dominantSpecies) {
        this.dominantSpecies = dominantSpecies;
    }

    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }
}

