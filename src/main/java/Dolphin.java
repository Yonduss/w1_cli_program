public class Dolphin extends Mammal {
    boolean isSwimming;

    public Dolphin() {
        super();
        isSwimming = false;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }
}
