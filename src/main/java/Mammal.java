public class Mammal extends Animal {
    int speed;
    int soundLevel;
    boolean isEating;
    boolean isSleeping;

    public Mammal() {
        super();
        this.speed = 5;
        this.soundLevel = 1;
        this.isEating = false;
        this.isSleeping = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public boolean isEating() {
        return isEating;
    }

    public void setEating(boolean eating) {
        isEating = eating;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }
}
