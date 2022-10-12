package zoo.saugetier;

import zoo.Tier;
import zoo.vogel.Papagei;

import java.util.Random;
import java.util.Scanner;

public class Saugetier extends Tier {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int input2 = scanner.nextInt();
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
