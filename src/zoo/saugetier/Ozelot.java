package zoo.saugetier;
import zoo.Tier;

public class Ozelot extends Saugetier {
    public Ozelot(final String name, final String color) {
        super(name, color);
    }
    public void makeSound() {
        System.out.println(this + ": Miau!");
    }
    public void greet(Tier t) {
        System.out.println(this + ": Hallo " + t + "!");
    }
    public void eat(int gramm) {
        System.out.println(this + ": Ich esse " + gramm + " Gramm Fischfutter.");
    }
    public void hunt(Saugetier s) {
        System.out.println(this + ": Ich jage " + s + ".");
        if(Math.random() > ((double) 1/3)){
            System.out.println(this + ": Ich habe " + s + " gefangen.");
        } else {
            System.out.println(this + ": Ich habe " + s + " nicht gefangen.");
        }
    }

    public void run() {
        System.out.println(this + ": Ich renne.");
    }
}
