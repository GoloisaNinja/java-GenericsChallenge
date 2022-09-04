public class PlatinumTierPlayer extends Player {
    private boolean isCurrent;

    public PlatinumTierPlayer(String name, boolean isCurrent) {
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
