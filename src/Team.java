import java.util.ArrayList;

public abstract class Team {
    private String name;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    abstract String returnRoster();

}
