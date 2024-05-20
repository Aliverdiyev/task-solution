package immutable20x;

public final class Market {
    private final int marketId;
    private final String name;
    private final String location;
    private final String category;
    private final String description;

    public Market(int marketId) {
        this(marketId, "", "", "", "");
        System.out.println("market 0");
    }

    public Market(int marketId, String name) {
        this(marketId, name, "", "", "");
        System.out.println("market 1");
    }

    public Market(int marketId, String name, String location) {
        this(marketId, name, location, "", "");
        System.out.println("market 2");
    }

    public Market(int marketId, String name, String location, String category) {
        this(marketId, name, location, category, "");
        System.out.println("market 3");
    }

    public Market(int marketId, String name, String location, String category, String description) {
        this.marketId = marketId;
        this.name = name;
        this.location = location;
        this.category = category;
        this.description = description;
        System.out.println("market 4");
    }

    // Getters

    public int getMarketId() {
        return marketId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}

