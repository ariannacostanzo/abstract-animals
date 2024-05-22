package animals.zoo;

public class Eagle extends Animal{

    //attributi



    //costruttore


    public Eagle(String name) {
        super(name);
    }

    //metodi
    @Override
    public void makeSound() {
        System.out.println("Haaaaaaaaaaah");
    }

    @Override
    public void eats() {
        System.out.println(name + " sta mangiando vermi");
    }


    //getter e setter
}
