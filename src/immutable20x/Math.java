package immutable20x;

public final class Math {
    private final String branch;  // e.g., Algebra, Geometry, Calculus, etc.
    private final String keyConcept;
    private final String application;
    private final String foundationalTheorem;
    private final String historicalFigure;

    public Math(String branch) {
        this(branch, "");
        System.out.println("math 0");
    }

    public Math(String branch, String keyConcept) {
        this(branch, keyConcept, "");
        System.out.println("math 1");
    }

    public Math(String branch, String keyConcept, String application) {
        this(branch, keyConcept, application, "");
        System.out.println("math 2");
    }

    public Math(String branch, String keyConcept, String application, String foundationalTheorem) {
        this(branch, keyConcept, application, foundationalTheorem, "");
        System.out.println("math 3");
    }

    public Math(String branch, String keyConcept, String application, String foundationalTheorem, String historicalFigure) {
        this.branch = branch;
        this.keyConcept = keyConcept;
        this.application = application;
        this.foundationalTheorem = foundationalTheorem;
        this.historicalFigure = historicalFigure;
        System.out.println("math 4");
    }

    // Getters
    public String getBranch() {
        return branch;
    }

    public String getKeyConcept() {
        return keyConcept;
    }

    public String getApplication() {
        return application;
    }

    public String getFoundationalTheorem() {
        return foundationalTheorem;
    }

    public String getHistoricalFigure() {
        return historicalFigure;
    }
}

