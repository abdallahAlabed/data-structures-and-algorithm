package queue;

public class Dogs extends Animal {

    public Dogs(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                '}';
    }
}