package encapsulation_20x;

public class Film {
    private String title;
    private double duration;
    private String genre;
    private String directorName;
    private boolean isReleased;

    public Film(String title) {
        this(title, 0.0);
        System.out.println("film 0");
    }

    public Film(String title, double duration) {
        this(title, duration, "");
        System.out.println("film 1");
    }

    public Film(String title, double duration, String genre) {
        this(title, duration, genre, "");
        System.out.println("film 2");
    }

    public Film(String title, double duration, String genre, String directorName) {
        this(title, duration, genre, directorName, true);
        System.out.println("film 3");
    }

    public Film(String title, double duration, String genre, String directorName, boolean isReleased) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.directorName = directorName;
        this.isReleased = isReleased;
        System.out.println("film 4");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public boolean isReleased() {
        return isReleased;
    }

    public void setReleased(boolean released) {
        isReleased = released;
    }
}

