package encapsulation20x;

public class Merchandise {
    private String productName;
    private double unitPrice;
    private String productDetails;
    private int unitsOnHand;
    private boolean activeListing;



    public Merchandise(String productName) {
        this(productName, 0);
        System.out.println("merchandise 0");
    }

    public Merchandise(String productName, double unitPrice) {
        this(productName, unitPrice, "");
        System.out.println("merchandise 1");
    }

    public Merchandise(String productName, double unitPrice, String productDetails) {
        this(productName, unitPrice, productDetails, 0);
        System.out.println("merchandise 2");
    }

    public Merchandise(String productName, double unitPrice, String productDetails, int unitsOnHand) {
        this(productName, unitPrice, productDetails, unitsOnHand, true);
        System.out.println("merchandise 3");
    }

    public Merchandise(String productName, double unitPrice, String productDetails, int unitsOnHand, boolean activeListing) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.productDetails = productDetails;
        this.unitsOnHand = unitsOnHand;
        this.activeListing = activeListing;
        System.out.println("merchandise 4");
    }

//    GETTER AND SETTER
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public boolean isActiveListing() {
        return activeListing;
    }

    public void setActiveListing(boolean activeListing) {
        this.activeListing = activeListing;
    }
}

