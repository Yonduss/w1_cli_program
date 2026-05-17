public class Eagle extends Bird {
    boolean isFlying;

    public Eagle(){
        super();
        this.isFlying = false;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }
}
