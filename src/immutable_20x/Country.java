package immutable_20x;

public final class Country {
    private final String name;
    private final String continent;
    private final String capital;
    private final double population;
    private final String currency;

    public Country(String name) {
        this(name, "");
        System.out.println("country 0");
    }

    public Country(String name, String continent) {
        this(name, continent, "");
        System.out.println("country 1");
    }

    public Country(String name, String continent, String capital) {
        this(name, continent, capital, 0.0);
        System.out.println("country 2");
    }

    public Country(String name, String continent, String capital, double population) {
        this(name, continent, capital, population, "");
        System.out.println("country 3");
    }

    public Country(String name, String continent, String capital, double population, String currency) {
        this.name = name;
        this.continent = continent;
        this.capital = capital;
        this.population = population;
        this.currency = currency;
        System.out.println("country 4");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public String getCurrency() {
        return currency;
    }
}

