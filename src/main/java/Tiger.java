public class Tiger extends Mammal {
    boolean isWalking;
    boolean isRoaring;

    public Tiger() {
        super();
        isWalking = false;
        isRoaring = false;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean walking) {
        isWalking = walking;
    }

    public boolean isRoaring() {
        return isRoaring;
    }

    public void setRoaring(boolean roaring) {
        isRoaring = roaring;
    }
}
