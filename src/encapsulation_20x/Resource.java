package encapsulation_20x;

public class Resource {
    private String type;
    private double unitCost;
    private String specifications;
    private int unitsOnHand;
    private boolean readyToUse;

    public Resource(String type) {
        this(type, 0.0);
        System.out.println("resource 0");
    }

    public Resource(String type, double unitCost) {
        this(type, unitCost, "");
        System.out.println("resource 1");
    }

    public Resource(String type, double unitCost, String specifications) {
        this(type, unitCost, specifications, 0);
        System.out.println("resource 2");
    }

    public Resource(String type, double unitCost, String specifications, int unitsOnHand) {
        this(type, unitCost, specifications, unitsOnHand, true);
        System.out.println("resource 3");
    }

    public Resource(String type, double unitCost, String specifications, int unitsOnHand, boolean readyToUse) {
        this.type = type;
        this.unitCost = unitCost;
        this.specifications = specifications;
        this.unitsOnHand = unitsOnHand;
        this.readyToUse = readyToUse;
        System.out.println("resource 4");
    }

    // ... (Getters and Setters)

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public boolean isReadyToUse() {
        return readyToUse;
    }

    public void setReadyToUse(boolean readyToUse) {
        this.readyToUse = readyToUse;
    }
}

