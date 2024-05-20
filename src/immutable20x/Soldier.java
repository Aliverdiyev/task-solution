package immutable20x;

public final class Soldier {
    private final String name;
    private final String rank;
    private final String branch;
    private final String unit;
    private final int yearsOfService;

    public Soldier(String name) {
        this(name, "");
        System.out.println("soldier 0");
    }

    public Soldier(String name, String rank) {
        this(name, rank, "");
        System.out.println("soldier 1");
    }

    public Soldier(String name, String rank, String branch) {
        this(name, rank, branch, "");
        System.out.println("soldier 2");
    }

    public Soldier(String name, String rank, String branch, String unit) {
        this(name, rank, branch, unit, 0);
        System.out.println("soldier 3");
    }

    public Soldier(String name, String rank, String branch, String unit, int yearsOfService) {
        this.name = name;
        this.rank = rank;
        this.branch = branch;
        this.unit = unit;
        this.yearsOfService = yearsOfService;
        System.out.println("soldier 4");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getBranch() {
        return branch;
    }

    public String getUnit() {
        return unit;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }
}

