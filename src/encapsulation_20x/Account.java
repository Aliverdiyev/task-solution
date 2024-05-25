package encapsulation_20x;

public class Account {
    private int accountNumber;
    private double balance;
    private String accountType;
    private String ownerName;
    private boolean isOpen;

    public Account(int accountNumber) {
        this(accountNumber, 0.0);
        System.out.println("account 0");
    }

    public Account(int accountNumber, double balance) {
        this(accountNumber, balance, "");
        System.out.println("account 1");
    }

    public Account(int accountNumber, double balance, String accountType) {
        this(accountNumber, balance, accountType, "");
        System.out.println("account 2");
    }

    public Account(int accountNumber, double balance, String accountType, String ownerName) {
        this(accountNumber, balance, accountType, ownerName, true);
        System.out.println("account 3");
    }

    public Account(int accountNumber, double balance, String accountType, String ownerName, boolean isOpen) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.ownerName = ownerName;
        this.isOpen = isOpen;
        System.out.println("account 4");
    }

// ... (Getters and Setters)


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
