public class Player {
    private String name;
    private int personalWins = 0;
    private int personalLosses = 0;
    private int personalTies = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getPersonalWins() {
        return personalWins;
    }

    public int getPersonalLosses() {
        return personalLosses;
    }

    public int getPersonalTies() {
        return personalTies;
    }
}
