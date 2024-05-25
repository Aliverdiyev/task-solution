package immutable_20x;

public final class Marginal {
    private final String concept;
    private final String definition;
    private final String calculation;
    private final String application;
    private final String relatedConcept;

    public Marginal(String concept) {
        this(concept, "");
        System.out.println("marginal 0");
    }

    public Marginal(String concept, String definition) {
        this(concept, definition, "");
        System.out.println("marginal 1");
    }

    public Marginal(String concept, String definition, String calculation) {
        this(concept, definition, calculation, "");
        System.out.println("marginal 2");
    }

    public Marginal(String concept, String definition, String calculation, String application) {
        this(concept, definition, calculation, application, "");
        System.out.println("marginal 3");
    }

    public Marginal(String concept, String definition, String calculation, String application, String relatedConcept) {
        this.concept = concept;
        this.definition = definition;
        this.calculation = calculation;
        this.application = application;
        this.relatedConcept = relatedConcept;
        System.out.println("marginal 4");
    }

    // Getters
    public String getConcept() {
        return concept;
    }

    public String getDefinition() {
        return definition;
    }

    public String getCalculation() {
        return calculation;
    }

    public String getApplication() {
        return application;
    }

    public String getRelatedConcept() {
        return relatedConcept;
    }
}

