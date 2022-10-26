package zoo.fisch;
import zoo.Tier;

public abstract class Fisch extends Tier {
    protected Fisch(final String name, final String color) {
        super(name, color);
    }

    public void makeSound() {
        System.out.println(this + ": Glup!");
    }

    public void greet(Tier t) {
        System.out.println(this + ": Hallo " + t + "!");
    }

    public void eat(int gramm) {
        System.out.println(this + ": Ich esse " + gramm + " Gramm Fischfutter.");
    }

    public void swim() {
        System.out.println(this + ": Ich schwimme.");
    }
}


