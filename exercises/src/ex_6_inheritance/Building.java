package ex_6_inheritance;

public class Building {

    protected String door;
    protected String window;

    public Building(String door, String window) {
        this.door = door;
        this.window = window;
    }

    @Override
    public String toString() {
        return "Building{" +
                "door='" + door + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
