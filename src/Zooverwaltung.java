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
    private static Random random = new Random();
    private static final ArrayList<Tier> tiere = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            addallanimals(2);
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
                case 5 -> openZoo(random.nextInt(1000));
                case 6 -> System.exit(0);
                default -> System.out.println("Ungüldige Eingabe");
            }

        }

    }

    /**
     * If this method is called, the zoo is opened and all animals are allowed to make an action.
     */
    public static void openZoo(int people) {
        System.out.println("Herzlich Willkommen");
        System.out.println("Es sind " + people + " Besucher im Zoo");
        if (people < 200) {
            System.out.println("Es sind wenig Besucher da");
            openZooNrTwo();

        } else {
            System.out.println("Es sind viele Besucher da");
            openZooNrTwo();
        }
    }
    /**
     * This method is called by the openZoo method. It was Created to declutter the openZoo mehtod.
     */
    public static void openZooNrTwo(){
        for (Tier tier : tiere) {
            System.out.println(tier);
        }
        for (Tier tier : tiere){
            tier.eat(1000);
        }
    }
    /**
     * This method adds all animals to the tiere ArrayList.
     * @param amount The amount of animals that should be added.
     */
    public static void addallanimals(int amount) {
        addFisch(amount);
        addVogel(amount);
        addSaugetier(amount);
    }
    /**
     * This method finds Fisch in the tiere ArrayList and adds them to a new one.
     */
    public static ArrayList<Tier> getFisch() {
        ArrayList<Tier> fische = new ArrayList<>();
        for (Tier tier : tiere) {
            if (tier instanceof Fisch) {
                fische.add(tier);
            }
        }
        return fische;
    }
    /**
     * This method finds Vogel in the tiere ArrayList and adds them to a new one.
     */
    public static ArrayList<Tier> getVogel() {
        ArrayList<Tier> voegel = new ArrayList<>();
        for (Tier tier : tiere) {
            if (tier instanceof Vogel) {
                voegel.add(tier);
            }
        }
        return voegel;
    }
    /**
     * This method finds Saugetier in the tiere ArrayList and adds them to a new one.
     */
    public static ArrayList<Tier> getSaugetier() {
        ArrayList<Tier> saugetiere = new ArrayList<>();
        for (Tier tier : tiere) {
            if (tier instanceof Saugetier) {
                saugetiere.add(tier);
            }
        }
        return saugetiere;
    }
    public void addTier(Tier t) {
        if (t != null) {
            tiere.add(t);
        }
    }
    /**
     * This method adds Fisch to the tiere ArrayList.
     * @param amount The amount of Fisch that should be added.
     */
    public static void addFisch(int amount) {
        for (int i = 0; i < amount; i++) {
            if (random.nextInt(2) == 0) {
                tiere.add(new Lachs("Lachs", "grün"));
            } else {
                tiere.add(new Hai("Hai"));
            }
        }
    }
/**
     * This method adds Vogel to the tiere ArrayList.
     * @param amount The amount of Vogel that should be added.
     */
    public static void addVogel(int amount) {
        for (int i = 0; i < amount; i++) {
            if (random.nextInt(2) == 0) {
                tiere.add(new Papagei("Papagei", "gelb"));
            } else {
                tiere.add(new Rabe("Rabe", "pink"));
            }
        }
    }
/**
     * This method adds Saugetier to the tiere ArrayList.
     * @param amount The amount of Saugetier that should be added.
     */
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