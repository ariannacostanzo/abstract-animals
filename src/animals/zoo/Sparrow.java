package animals.zoo;

public class Sparrow extends Animal{

    //atributi

    //costruttore


    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cip cip");
    }

    @Override
    public void eats() {
        System.out.println(name + " sta mangiando uvetta");
    }
}
