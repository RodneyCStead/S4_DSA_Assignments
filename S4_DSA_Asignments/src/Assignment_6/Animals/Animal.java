package Assignment_6.Animals;

public abstract class Animal {
    private String name;
    private long timestamp;

    public Animal (String name) {
        this.name = name;
        this.timestamp = System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
