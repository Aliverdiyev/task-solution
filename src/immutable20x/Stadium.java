package immutable20x;

public final class Stadium {
    private final String name;
    private final String city;
    private final int capacity;
    private final String homeTeam;
    private final String sport;

    public Stadium(String name) {
        this(name, "");
        System.out.println("stadium 0");
    }

    public Stadium(String name, String city) {
        this(name, city, 0);
        System.out.println("stadium 1");
    }

    public Stadium(String name, String city, int capacity) {
        this(name, city, capacity, "");
        System.out.println("stadium 2");
    }

    public Stadium(String name, String city, int capacity, String homeTeam) {
        this(name, city, capacity, homeTeam, "");
        System.out.println("stadium 3");
    }

    public Stadium(String name, String city, int capacity, String homeTeam, String sport) {
        this.name = name;
        this.city = city;
        this.capacity = capacity;
        this.homeTeam = homeTeam;
        this.sport = sport;
        System.out.println("stadium 4");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getSport() {
        return sport;
    }
}
