package immutable_20x;

public final class Phone {
    private final int phoneNumber;
    private final double serviceBalance; //
    private final String lineType;
    private final String ownerName;
    private final boolean isActive;

    public Phone(int phoneNumber) {
        this(phoneNumber, 0.0);
        System.out.println("phone 0");
    }

    public Phone(int phoneNumber, double serviceBalance) {
        this(phoneNumber, serviceBalance, "");
        System.out.println("phone 1");
    }

    public Phone(int phoneNumber, double serviceBalance, String lineType) {
        this(phoneNumber, serviceBalance, lineType, "");
        System.out.println("phone 2");
    }

    public Phone(int phoneNumber, double serviceBalance, String lineType, String ownerName) {
        this(phoneNumber, serviceBalance, lineType, ownerName, true);
        System.out.println("phone 3");
    }

    public Phone(int phoneNumber, double serviceBalance, String lineType, String ownerName, boolean isActive) {
        this.phoneNumber = phoneNumber;
        this.serviceBalance = serviceBalance;
        this.lineType = lineType;
        this.ownerName = ownerName;
        this.isActive = isActive;
        System.out.println("phone 4");
    }

    // Getters

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double getServiceBalance() {
        return serviceBalance;
    }

    public String getLineType() {
        return lineType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isActive() {
        return isActive;
    }
}