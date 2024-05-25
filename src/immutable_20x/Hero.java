package immutable_20x;

public final class Hero {
    private final String name;
    private final String alias;
    private final String superpower;
    private final String origin;
    private final String nemesis;

    public Hero(String name) {
        this(name, "");
        System.out.println("hero 0");
    }

    public Hero(String name, String alias) {
        this(name, alias, "");
        System.out.println("hero 1");
    }

    public Hero(String name, String alias, String superpower) {
        this(name, alias, superpower, "");
        System.out.println("hero 2");
    }

    public Hero(String name, String alias, String superpower, String origin) {
        this(name, alias, superpower, origin, "");
        System.out.println("hero 3");
    }

    public Hero(String name, String alias, String superpower, String origin, String nemesis) {
        this.name = name;
        this.alias = alias;
        this.superpower = superpower;
        this.origin = origin;
        this.nemesis = nemesis;
        System.out.println("hero 4");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getSuperpower() {
        return superpower;
    }

    public String getOrigin() {
        return origin;
    }

    public String getNemesis() {
        return nemesis;
    }
}

