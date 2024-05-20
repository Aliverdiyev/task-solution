package encapsulation20x;

public class Subscription {
private String planName;
private double monthlyFee;
private String benefits;
private int userLimit;
private boolean active;

    public Subscription(String planName) {
        this(planName, 0.0);
        System.out.println("subscription 0");
    }

    public Subscription(String planName, double monthlyFee) {
        this(planName, monthlyFee, "");
        System.out.println("subscription 1");
    }

    public Subscription(String planName, double monthlyFee, String benefits) {
        this(planName, monthlyFee, benefits, 0);
        System.out.println("subscription 2");
    }

    public Subscription(String planName, double monthlyFee, String benefits, int userLimit) {
        this(planName, monthlyFee, benefits, userLimit, true);
        System.out.println("subscription 3");
    }

    public Subscription(String planName, double monthlyFee, String benefits, int userLimit, boolean active) {
        this.planName = planName;
        this.monthlyFee = monthlyFee;
        this.benefits = benefits;
        this.userLimit = userLimit;
        this.active = active;
        System.out.println("subscription 4");
    }
    // ... (Getters and Setters)

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public int getUserLimit() {
        return userLimit;
    }

    public void setUserLimit(int userLimit) {
        this.userLimit = userLimit;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

