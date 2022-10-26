package zoo;
import java.util.ArrayList;
public abstract class Tier {
    private final String name;
    private final String color;
    private final ArrayList<Tier> animals = new ArrayList<Tier>();
    protected Tier(final String name, final String color) {
        this.name = name;
        this.color = color;
    }
    public abstract void makeSound();
    public abstract void greet(Tier t);
    public abstract void eat(int gramm);

    public final void sleep(int hours) {
        System.out.println("Tier " + name + " schläft " + hours + " Stunden.");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    @Override

    public String toString() {
        return super.toString();
    }
}
