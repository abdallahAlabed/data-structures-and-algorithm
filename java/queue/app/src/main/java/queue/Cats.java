package queue;

public class Cats extends Animal {
    public Cats(String name) {
        super(name);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                '}';
    }
}