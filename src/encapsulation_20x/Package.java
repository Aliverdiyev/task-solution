package encapsulation_20x;

public class Package {
    private String packageName;
    private double price;
    private String inclusions;
    private int maxParticipants;
    private boolean currentlyOffered;

    public Package(String packageName) {
        this(packageName, 0.0);
        System.out.println("package 0");
    }

    public Package(String packageName, double price) {
        this(packageName, price, "");
        System.out.println("package 1");
    }

    public Package(String packageName, double price, String inclusions) {
        this(packageName, price, inclusions, 0);
        System.out.println("package 2");
    }

    public Package(String packageName, double price, String inclusions, int maxParticipants) {
        this(packageName, price, inclusions, maxParticipants, true);
        System.out.println("package 3");
    }

    public Package(String packageName, double price, String inclusions, int maxParticipants, boolean currentlyOffered) {
        this.packageName = packageName;
        this.price = price;
        this.inclusions = inclusions;
        this.maxParticipants = maxParticipants;
        this.currentlyOffered = currentlyOffered;
        System.out.println("package 4");
    }

// ... (Getters and Setters)

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInclusions() {
        return inclusions;
    }

    public void setInclusions(String inclusions) {
        this.inclusions = inclusions;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public boolean isCurrentlyOffered() {
        return currentlyOffered;
    }

    public void setCurrentlyOffered(boolean currentlyOffered) {
        this.currentlyOffered = currentlyOffered;
    }
}
