public class Penguin extends Bird {
    boolean isSliding;
    boolean isSwimming;

    public Penguin() {
        super();
        this.isSliding = false;
        this.isSwimming = false;
    }

    public boolean isSliding() {
        return isSliding;
    }

    public void setSliding(boolean sliding) {
        isSliding = sliding;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }
}
