package encapsulation_20x;
public class Membership {
    private String membershipType;
    private double annualCost;
    private String perks;
    private int memberLimit;
    private boolean isActive;

    public Membership(String membershipType) {
        this(membershipType, 0.0);
        System.out.println("membership 0");
    }

    public Membership(String membershipType, double annualCost) {
        this(membershipType, annualCost, "");
        System.out.println("membership 1");
    }

    public Membership(String membershipType, double annualCost, String perks) {
        this(membershipType, annualCost, perks, 0);
        System.out.println("membership 2");
    }

    public Membership(String membershipType, double annualCost, String perks, int memberLimit) {
        this(membershipType, annualCost, perks, memberLimit, true);
        System.out.println("membership 3");
    }

    public Membership(String membershipType, double annualCost, String perks, int memberLimit, boolean isActive) {
        this.membershipType = membershipType;
        this.annualCost = annualCost;
        this.perks = perks;
        this.memberLimit = memberLimit;
        this.isActive = isActive;
        System.out.println("membership 4");
    }

    // ... (Getters and Setters)

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public double getAnnualCost() {
        return annualCost;
    }

    public void setAnnualCost(double annualCost) {
        this.annualCost = annualCost;
    }

    public String getPerks() {
        return perks;
    }

    public void setPerks(String perks) {
        this.perks = perks;
    }

    public int getMemberLimit() {
        return memberLimit;
    }

    public void setMemberLimit(int memberLimit) {
        this.memberLimit = memberLimit;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

