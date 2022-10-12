package zoo.saugetier;
import zoo.Tier;
public class Bieber extends Saugetier {
    public Bieber(final String name, final String color) {
        super(name, color);
    }
    public void makeSound() {
        System.out.println(this + ": SÖDLGI!");
    }
    public void greet(Tier t) {
        System.out.println(this + ": Hallo " + t + "!");
    }
    public void eat(int gramm) {
        System.out.println(this + ": Ich esse " + gramm + " Gramm Bieberfutter.");
    }
    public void run() {
        System.out.println(this + ": Ich renne.");
    }
    public String toString() {
        return "Bieber";
    }
}

