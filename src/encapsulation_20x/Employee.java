package encapsulation_20x;

public class Employee {

    private int employeeId;
    private double salary;
    private String jobTitle;
    private int maxHoursPerWeek;
    private boolean isActive;

    public Employee(int employeeId) {
        this(employeeId, 0.0);
        System.out.println("employee 0");
    }

    public Employee(int employeeId, double salary) {
        this(employeeId, salary, "");
        System.out.println("employee 1");
    }

    public Employee(int employeeId, double salary, String jobTitle) {
        this(employeeId, salary, jobTitle, 0);
        System.out.println("employee 2");
    }

    public Employee(int employeeId, double salary, String jobTitle, int maxHoursPerWeek) {
        this(employeeId, salary, jobTitle, maxHoursPerWeek, true);
        System.out.println("employee 3");
    }

    public Employee(int employeeId, double salary, String jobTitle, int maxHoursPerWeek, boolean isActive) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.maxHoursPerWeek = maxHoursPerWeek;
        this.isActive = isActive;
        System.out.println("employee 4");
    }

    // ... (Getters and Setters)


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getMaxHoursPerWeek() {
        return maxHoursPerWeek;
    }

    public void setMaxHoursPerWeek(int maxHoursPerWeek) {
        this.maxHoursPerWeek = maxHoursPerWeek;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
