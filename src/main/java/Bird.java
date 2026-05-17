public class Bird extends Animal {
    int speed;
    boolean isWalking;
    boolean isSleeping;
    boolean isEating;

    public Bird() {
        super();
        this.speed = 5;
        this.isWalking = false;
        this.isSleeping = false;
        this.isEating = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean walking) {
        isWalking = walking;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public boolean isEating() {
        return isEating;
    }

    public void setEating(boolean eating) {
        isEating = eating;
    }
}
