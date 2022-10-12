package zoo.fisch;

public class Hai extends Fisch {
    public Hai(final String name) {
        super(name, "grau");
    }
    public void hunt(Fisch f) {
        System.out.println(this + ": Ich jage " + f + ".");
        if(Math.random() > ((double) 1/3)){
            System.out.println(this + ": Ich habe " + f + " gefangen.");
        } else {
            System.out.println(this + ": Ich habe " + f + " nicht gefangen.");
        }
    }
    public String toString() {
        return "Hai";
    }
}
