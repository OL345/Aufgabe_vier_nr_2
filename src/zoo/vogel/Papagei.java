package zoo.vogel;
import zoo.Tier;
public class Papagei extends Vogel{

    public Papagei(final String name, final String color) {
        super(name, color);
    }
    public void makeSound() {
        System.out.println(this + ": Glup!");
    }

    public void greet(Tier t) {
        System.out.println(this + ": Hallo " + t + "!");
    }

    public void eat(int gramm) {
        System.out.println(this + ": Ich esse " + gramm + " Gramm Vogelfutter.");
    }

    public void fly() {
        System.out.println(this + ": Ich fliege.");
    }
    public String toString() {
        return "Papagei";
    }
}
