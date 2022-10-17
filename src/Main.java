import zoo.fisch.*;
import zoo.saugetier.*;
import zoo.vogel.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lachs lachs = new Lachs("Lachs", "grün");
        Hai hai = new Hai("Hai");
        Bieber bieber = new Bieber("Bieber", "Türkis");
        Ozelot ozelot = new Ozelot("Ozelot", "schwarz");
        Papagei papagei = new Papagei("Papagei", "gelb");
        Rabe rabe = new Rabe("Rabe", "pink");

        while (true) {
            System.out.println("\n1. Fische");
            System.out.println("2. Vögel");
            System.out.println("3. Säugetiere");
            System.out.println("4. Exit program");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("\n1. Lachs");
                    System.out.println("2. Hai");
                    System.out.println("3. Exit");
                    input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("\n1. Make sound");
                        System.out.println("2. Greet");
                        System.out.println("3. Eat");
                        System.out.println("4. Swim");
                        System.out.println("5. Exit");
                        input = scanner.nextInt();
                        if (input == 1) {
                            lachs.makeSound();
                        } else if (input == 2) {
                            lachs.greet(lachs);
                        } else if (input == 3) {
                            lachs.eat(100);
                        } else if (input == 4) {
                            lachs.swim();
                        } else if (input == 5) {
                            System.exit(0);
                        }
                    } else if (input == 2) {
                        System.out.println("\n1. Make sound");
                        System.out.println("2. Greet");
                        System.out.println("3. Eat");
                        System.out.println("4. Swim");
                        System.out.println("5. Hunt");
                        System.out.println("6. Exit");
                        input = scanner.nextInt();
                        if (input == 1) {
                            hai.makeSound();
                        } else if (input == 2) {
                            hai.greet(hai);
                        } else if (input == 3) {
                            hai.eat(100);
                        } else if (input == 4) {
                            hai.swim();
                        } else if (input == 5) {
                            hai.hunt(lachs);
                        } else if (input == 6) {
                            System.exit(0);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("\n1. Rabe");
                    System.out.println("2. Papagei");
                    System.out.println("3. Exit");
                    input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("\n1. Make sound");
                        System.out.println("2. Greet");
                        System.out.println("3. Eat");
                        System.out.println("4. Fly");
                        System.out.println("5. Exit");
                        input = scanner.nextInt();
                        if (input == 1) {
                            rabe.makeSound();
                        } else if (input == 2) {
                            rabe.greet(papagei);
                        } else if (input == 3) {
                            rabe.eat(100);
                        } else if (input == 4) {
                            rabe.fly();
                        } else if (input == 5) {
                            System.exit(0);
                        }
                    } else if (input == 2) {
                        System.out.println("\n1. Make sound");
                        System.out.println("2. Greet");
                        System.out.println("3. Eat");
                        System.out.println("4. Fly");
                        System.out.println("5. Exit");
                        input = scanner.nextInt();
                        if (input == 1) {
                            papagei.makeSound();
                        } else if (input == 2) {
                            papagei.greet(papagei);
                        } else if (input == 3) {
                            papagei.eat(100);
                        } else if (input == 4) {
                            papagei.fly();
                        } else if (input == 5) {
                            System.exit(0);
                        }
                    } else if (input == 3) {
                        System.exit(0);
                    }
                }
                case 3 -> {
                    System.out.println("\n1. Bieber");
                    System.out.println("2. Ozelot");
                    System.out.println("3. Exit");
                    input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("\n1. Make sound");
                        System.out.println("2. Greet");
                        System.out.println("3. Eat");
                        System.out.println("4. Run");
                        System.out.println("5. Exit");
                        input = scanner.nextInt();
                        if (input == 1) {
                            bieber.makeSound();
                        } else if (input == 2) {
                            rabe.greet(papagei);
                        } else if (input == 3) {
                            rabe.eat(100);
                        } else if (input == 4) {
                            rabe.fly();
                        } else if (input == 5) {
                            System.exit(0);
                        }
                    } else if (input == 2) {
                        System.out.println("\n1. Make sound");
                        System.out.println("2. Greet");
                        System.out.println("3. Eat");
                        System.out.println("4. Hunt");
                        System.out.println("5. Exit");
                        input = scanner.nextInt();
                        if (input == 1) {
                            ozelot.makeSound();
                        } else if (input == 2) {
                            ozelot.greet(papagei);
                        } else if (input == 3) {
                            ozelot.eat(100);
                        } else if (input == 4) {
                            ozelot.hunt(bieber);
                        } else if (input == 5) {
                            System.exit(0);
                        }
                    } else if (input == 3) {
                        System.exit(0);
                    }
                }
                case 4 -> System.exit(0);
            }
        }
    }

}