package animals.zoo;

public class Zoo {

    public static void main(String[] args) {
        Animal[] zoo = {new Dog("cane"), new Eagle("aquila"), new Dolphin("delfino"), new Sparrow("passerotto")};

        for (Animal animal : zoo) {
            animal.sleep();
            animal.makeSound();
            animal.eats();

            if (animal instanceof CanFly) {
                faiVolare((CanFly) animal);
            } else if (animal instanceof CanSwim) {
                faiNuotare((CanSwim) animal);
            }

        }
        

        
    }

    public static void faiVolare(CanFly flying) {
        flying.fly();
    }

    public static void faiNuotare(CanSwim swimming) {
        swimming.swim();
    }
    
    
}
