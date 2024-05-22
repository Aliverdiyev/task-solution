package encapsulation_20x;

public class Game {
    private String title;
    private int numPlayers;
    private String genre;
    private String developer;
    private boolean isReleased;

    public Game(String title) {
        this(title, 0);
        System.out.println("game 0");
    }

    public Game(String title, int numPlayers) {
        this(title, numPlayers, "");
        System.out.println("game 1");
    }

    public Game(String title, int numPlayers, String genre) {
        this(title, numPlayers, genre, "");
        System.out.println("game 2");
    }

    public Game(String title, int numPlayers, String genre, String developer) {
        this(title, numPlayers, genre, developer, true);
        System.out.println("game 3");
    }

    public Game(String title, int numPlayers, String genre, String developer, boolean isReleased) {
        this.title = title;
        this.numPlayers = numPlayers;
        this.genre = genre;
        this.developer = developer;
        this.isReleased = isReleased;
        System.out.println("game 4");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public boolean isReleased() {
        return isReleased;
    }

    public void setReleased(boolean released) {
        isReleased = released;
    }
}
