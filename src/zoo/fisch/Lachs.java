package zoo.fisch;
import zoo.Tier;

public class Lachs extends Fisch {
    public Lachs(final String name, final String color) {
        super(name, color);
    }
    public void makeSound() {
        System.out.println(this + ": Glup!");
    }

    public void greet(Tier t) {
        System.out.println(this + ": Hallo " + t + "!");
        System.out.println(this + ": Hallo " + t + "!");
    }


    public void eat(int gramm) {
        System.out.println(this + ": Ich esse " + gramm + " Gramm Fischfutter.");
    }


    public void swim() {
        System.out.println(this + ": Ich schwimme.");
    }

    public String toString() {
        return "Lachs";
    }
}