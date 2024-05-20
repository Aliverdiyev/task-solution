package immutable20x;

public final class Comics {
    private final String title;
    private final String publisher;
    private final String genre; // Superhero, Sci-Fi, Fantasy, etc.
    private final int firstIssueYear;
    private final String mainCharacters;

    public Comics(String title) {
        this(title, "");
        System.out.println("comics 0");
    }

    public Comics(String title, String publisher) {
        this(title, publisher, "");
        System.out.println("comics 1");
    }

    public Comics(String title, String publisher, String genre) {
        this(title, publisher, genre, 0);
        System.out.println("comics 2");
    }

    public Comics(String title, String publisher, String genre, int firstIssueYear) {
        this(title, publisher, genre, firstIssueYear, "");
        System.out.println("comics 3");
    }

    public Comics(String title, String publisher, String genre, int firstIssueYear, String mainCharacters) {
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.firstIssueYear = firstIssueYear;
        this.mainCharacters = mainCharacters;
        System.out.println("comics 4");
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getFirstIssueYear() {
        return firstIssueYear;
    }

    public String getMainCharacters() {
        return mainCharacters;
    }
}

