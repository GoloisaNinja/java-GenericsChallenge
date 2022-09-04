public class GoldTierPlayer extends Player {
    private boolean isCurrent;

    public GoldTierPlayer(String name, boolean isCurrent) {
        super(name);
        this.isCurrent = isCurrent;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }
}
