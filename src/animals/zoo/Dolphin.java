package animals.zoo;

public class Dolphin extends Animal implements CanSwim{

    //attributi

    //costruttore


    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Fiuuuu");
    }

    @Override
    public void eats() {
        System.out.println(name + " sta mangiando calamari");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando!!");
    }
}
