package immutable20x;

public final class Humanity {
    private final String origin;
    private final double globalPopulation;
    private final String dominantCulture;
    private final String definingTrait;
    private final String greatestChallenge;

    public Humanity(String origin) {
        this(origin, 0.0);
        System.out.println("humanity 0");
    }

    public Humanity(String origin, double globalPopulation) {
        this(origin, globalPopulation, "");
        System.out.println("humanity 1");
    }

    public Humanity(String origin, double globalPopulation, String dominantCulture) {
        this(origin, globalPopulation, dominantCulture, "");
        System.out.println("humanity 2");
    }

    public Humanity(String origin, double globalPopulation, String dominantCulture, String definingTrait) {
        this(origin, globalPopulation, dominantCulture, definingTrait, "");
        System.out.println("humanity 3");
    }

    public Humanity(String origin, double globalPopulation, String dominantCulture, String definingTrait, String greatestChallenge) {
        this.origin = origin;
        this.globalPopulation = globalPopulation;
        this.dominantCulture = dominantCulture;
        this.definingTrait = definingTrait;
        this.greatestChallenge = greatestChallenge;
        System.out.println("humanity 4");
    }

    // Getters
    public String getOrigin() {
        return origin;
    }

    public double getGlobalPopulation() {
        return globalPopulation;
    }

    public String getDominantCulture() {
        return dominantCulture;
    }

    public String getDefiningTrait() {
        return definingTrait;
    }

    public String getGreatestChallenge() {
        return greatestChallenge;
    }
}

