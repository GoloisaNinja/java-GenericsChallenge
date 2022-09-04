import java.util.ArrayList;

public class GoldTeam<P extends Player> extends Team {
    private ArrayList<P> members;
    public GoldTeam(String name) {
        super(name);
        this.members = new ArrayList<>();
    }

    public boolean addMember(P player) {
        if (members.contains(player)) {
            System.out.println("Player is already a member of the team");
            return false;
        } else {
            members.add(player);
            return true;
        }
    }
    @Override
    public String returnRoster() {
        String result = "";
        for (Player player: members) {
            result += "Name -> " + player.getName() + "\n";
        }
        return result;
    }
    public String toString() {
        return "Team Name: " + this.getName() + "\n" +
               "Wins: " + this.getWins() + "\n" +
               "Losses: " + this.getLosses() + "\n" +
               "Ties: " + this.getTies() + "\n" +
               "Roster: " + "\n" +
               this.returnRoster();

    }
}
