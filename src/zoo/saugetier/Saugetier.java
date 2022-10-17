package zoo.saugetier;
import zoo.Tier;
import java.util.Scanner;

public class Saugetier extends Tier {
    protected Saugetier(final String name, final String color) {
        super(name, color);
    }

    public void makeSound() {
        System.out.println("Tier " + getName() + " macht Geräusche.");
    }
    public void greet(Tier t) {}
    public void eat(int gramm) {}
    public void swim() {
        System.out.println(this + ": Ich laufe.");
    }
}
