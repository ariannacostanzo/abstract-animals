package animals.zoo;

public abstract class Animal {

    //attributi
    protected String name;

    //costruttore


    public Animal(String name) {
        this.name = name;
    }

    //metodi
    public abstract void makeSound();

    public void sleep() {
        System.out.println("zzz");
    }

    public abstract void eats();

    //getter e setter
    public String getName() {
        return name;
    }
}
