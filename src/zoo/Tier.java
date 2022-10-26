package zoo;
public abstract class Tier {
    private final String name;
    private final String color;
    protected Tier(final String name, final String color) {
        this.name = name;
        this.color = color;
    }
    /**
     * The method makeSound() is an abstract method from the class Tier. It prints the sound of an animal
     */
    public abstract void makeSound();
    /**
     * The method greet() is an abstract method from the class Tier. It prints the greeting of an animal
     */
    public abstract void greet(Tier t);
    /**
     * The method eat() is an abstract method from the class Tier. It prints the food of an animal
     */
    public abstract void eat(int gramm);

    /**
    *The method sleep is used to let animals sleep an unspecified amount of time
    */
    public final void sleep(int hours) {
        System.out.println("Tier " + name + " schläft " + hours + " Stunden.");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    @Override

    public String toString() {
        return super.toString();
    }
}
