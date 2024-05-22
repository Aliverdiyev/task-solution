package encapsulation_20x;

public class Service {
    private String title;
    private double hourlyRate;
    private String overview;
    private int maxSlots;
    private boolean bookable;

    public Service(String title) {
        this(title, 0.0);
        System.out.println("service 0");
    }

    public Service(String title, double hourlyRate) {
        this(title, hourlyRate, "");
        System.out.println("service 1");
    }

    public Service(String title, double hourlyRate, String overview) {
        this(title, hourlyRate, overview, 0);
        System.out.println("service 2");
    }

    public Service(String title, double hourlyRate, String overview, int maxSlots) {
        this(title, hourlyRate, overview, maxSlots, true);
        System.out.println("service 3");
    }

    public Service(String title, double hourlyRate, String overview, int maxSlots, boolean bookable) {
        this.title = title;
        this.hourlyRate = hourlyRate;
        this.overview = overview;
        this.maxSlots = maxSlots;
        this.bookable = bookable;
        System.out.println("service 4");
    }

    // ... (Getters and Setters)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getMaxSlots() {
        return maxSlots;
    }

    public void setMaxSlots(int maxSlots) {
        this.maxSlots = maxSlots;
    }

    public boolean isBookable() {
        return bookable;
    }

    public void setBookable(boolean bookable) {
        this.bookable = bookable;
    }
}

