package encapsulation20x;

public class Song {
    private String title;
    private double duration; // In minutes or seconds
    private String genre;
    private String artistName;
    private boolean isReleased;

    public Song(String title) {
        this(title, 0.0);
        System.out.println("song 0");
    }

    public Song(String title, double duration) {
        this(title, duration, "");
        System.out.println("song 1");
    }

    public Song(String title, double duration, String genre) {
        this(title, duration, genre, "");
        System.out.println("song 2");
    }

    public Song(String title, double duration, String genre, String artistName) {
        this(title, duration, genre, artistName, true);
        System.out.println("song 3");
    }

    public Song(String title, double duration, String genre, String artistName, boolean isReleased) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.artistName = artistName;
        this.isReleased = isReleased;
        System.out.println("song 4");
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

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public boolean isReleased() {
        return isReleased;
    }

    public void setReleased(boolean released) {
        isReleased = released;
    }
}

