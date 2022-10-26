import zoo.Tier;
import zoo.fisch.Fisch;
import zoo.fisch.Hai;
import zoo.fisch.Lachs;
import zoo.saugetier.Bieber;
import zoo.saugetier.Ozelot;
import zoo.saugetier.Saugetier;
import zoo.vogel.Papagei;
import zoo.vogel.Rabe;
import zoo.vogel.Vogel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zooverwaltung {

    static Random random = new Random();
    private static final ArrayList<Tier> tiere = new ArrayList<Tier>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            addallanimals(5);
            System.out.println("\n1. Alle Tiere ausgeben");
            System.out.println("2. Alle Fische ausgeben");
            System.out.println("3. Alle Vögel ausgeben");
            System.out.println("4. Alle Saugetiere ausgeben");
            System.out.println("5. Zoo Tag Simulieren");
            System.out.println("6. Exit");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> System.out.println(tiere);
                case 2 -> System.out.println(getFisch());
                case 3 -> System.out.println(getVogel());
                case 4 -> System.out.println(getSaugetier());
                case 5 -> openZoo(111);
                case 6 -> System.exit(0);
                default -> System.out.println("Ungüldige Eingabe");
            }

        }

    }

    /**
     * If this method is called, the zoo is opened and all animals are allowed to make a actionm.
     */
    public static void openZoo(int people) {
        System.out.println("Herzlich Willkommen");
        System.out.println("Der Zoo öffnet seine Pforten");
        if (people < 200) {
            System.out.println("Es sind wenig Besucher da");
            for (Tier tier : tiere) {
                System.out.println(tier);
            }
            for (Tier tier : tiere){
                tier.eat(1000);
            }
        } else {
            System.out.println("Es sind viele Besucher da");
        }
    }
    public static void addallanimals(int amount) {
        addFisch(amount);
        addVogel(amount);
        addSaugetier(amount);
    }
    public static ArrayList<Tier> getFisch() {
        ArrayList<Tier> fische = new ArrayList<>();
        for (int i = 0; i < tiere.size(); i++) {
            if (tiere.get(i) instanceof Fisch) {
                fische.add(tiere.get(i));
            }
        }
        return fische;
    }
    public static ArrayList<Tier> getVogel() {
        ArrayList<Tier> voegel = new ArrayList<>();
        for (int i = 0; i < tiere.size(); i++) {
            if (tiere.get(i) instanceof Vogel) {
                voegel.add(tiere.get(i));
            }
        }
        return voegel;
    }
    public static ArrayList<Tier> getSaugetier() {
        ArrayList<Tier> saugetiere = new ArrayList<>();
        for (int i = 0; i < tiere.size(); i++) {
            if (tiere.get(i) instanceof Saugetier) {
                saugetiere.add(tiere.get(i));
            }
        }
        return saugetiere;
    }
    public void addTier(Tier t) {
        if (t != null) {
            tiere.add(t);
        }
    }

    public static void addFisch(int amount) {
        for (int i = 0; i < amount; i++) {
            if (random.nextInt(2) == 0) {
                tiere.add(new Lachs("Lachs", "grün"));
            } else {
                tiere.add(new Hai("Hai"));
            }
        }
    }

    public static void addVogel(int amount) {
        for (int i = 0; i < amount; i++) {
            if (random.nextInt(2) == 0) {
                tiere.add(new Papagei("Papagei", "gelb"));
            } else {
                tiere.add(new Rabe("Rabe", "pink"));
            }
        }
    }

    public static void addSaugetier(int amount) {
        for (int i = 0; i < amount; i++) {
            if (random.nextInt(2) == 0) {
                tiere.add(new Bieber("Bieber", "Türkis"));
            } else {
                tiere.add(new Ozelot("Ozelot", "schwarz"));
            }
        }
    }
}