package encapsulation_20x;

public class Football {
    private String teamName;
    private int wins;
    private String league;
    private String coachName;
    private boolean isActive;

    public Football(String teamName) {
        this(teamName, 0);
        System.out.println("football 0");
    }

    public Football(String teamName, int wins) {
        this(teamName, wins, "");
        System.out.println("football 1");
    }

    public Football(String teamName, int wins, String league) {
        this(teamName, wins, league, "");
        System.out.println("football 2");
    }

    public Football(String teamName, int wins, String league, String coachName) {
        this(teamName, wins, league, coachName, true);
        System.out.println("football 3");
    }

    public Football(String teamName, int wins, String league, String coachName, boolean isActive) {
        this.teamName = teamName;
        this.wins = wins;
        this.league = league;
        this.coachName = coachName;
        this.isActive = isActive;
        System.out.println("football 4");
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

