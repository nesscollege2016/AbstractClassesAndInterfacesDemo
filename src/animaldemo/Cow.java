package animaldemo;

/**
 * Created by Dev on 04/04/2016.
 */
public class Cow extends Animal {

    public Cow(String name) {
        super(name, Food.GRASS);
    }

    public void giveMilk(){
        System.out.println("Milking...");
    }

    @Override
    public void makeSound() {

    }
}
