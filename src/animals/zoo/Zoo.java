package animals.zoo;

public class Zoo {

    public static void main(String[] args) {
        Animal[] zoo = {new Dog("cane"), new Eagle("aquila"), new Dolphin("delfino"), new Sparrow("passerotto")};

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].sleep();
            zoo[i].makeSound();
            zoo[i].eats();

        }
        
        
        
        
        
        
        
        
        
    }
    
    
}
