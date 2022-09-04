
public class Main {
    public static void main(String[] args) {

        PlatinumTeam<PlatinumTierPlayer> platinumTeam = new PlatinumTeam("Wizards");
        PlatinumTierPlayer joanna = new PlatinumTierPlayer("Joanna", true);
        PlatinumTierPlayer adrian = new PlatinumTierPlayer("Adrian", true);
        PlatinumTierPlayer chuck = new PlatinumTierPlayer("Chuck", true);
        PlatinumTierPlayer anna = new PlatinumTierPlayer("Anna", true);
        platinumTeam.addMember(joanna);
        platinumTeam.addMember(adrian);
        platinumTeam.addMember(chuck);
        platinumTeam.addMember(anna);

        GoldTeam<GoldTierPlayer> goldTeam = new GoldTeam<>("Elves");
        GoldTierPlayer dexter = new GoldTierPlayer("Dexter", true);
        GoldTierPlayer wags = new GoldTierPlayer("Wags", true);
        GoldTierPlayer maximus = new GoldTierPlayer("Maximus", true);
        goldTeam.addMember(dexter);
        goldTeam.addMember(wags);
        goldTeam.addMember(maximus);

        System.out.println(platinumTeam);
        System.out.println(goldTeam);

        League<PlatinumTeam> platinumLeague = new League<>("Platinum Jawas");
        platinumLeague.addTeam(platinumTeam);

        League<GoldTeam> goldLeague = new League<>("Golden Gods");
        goldLeague.addTeam(goldTeam);

        System.out.println(platinumLeague);
        System.out.println(goldLeague);

    }
}