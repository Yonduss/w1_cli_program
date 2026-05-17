public class Animal {
    private String name;
    private int weight;
    private int height;

    public Animal() {
        name = "Unknown";
    }

    public Animal(String name, int weight, int height) {
        this.name = name;
        this.weight = 200;
        this.height = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
