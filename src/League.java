import java.util.ArrayList;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("Team is already in league");
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }
    public String toString() {
        String result = this.getName() + " Team Roster!" + "\n";
        for (int i = 0; i < teams.size(); i++) {
            result += i + 1 + ". " + teams.get(i).getName() + "\n";
        }
        return result;
    }
}
