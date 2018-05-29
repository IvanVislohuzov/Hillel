package vislohuzov.homeWork.first;

/**
 * Created by Ivan on 24.05.2018.
 */
public class Runner {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();
        dog.setName("Dog");
        dog.setBreed("Labrador");
        cat.setName("Cat");
        cat.setBreed("Nebelung");

        System.out.println(dog.getName() + " " + dog.getBreed());
        System.out.println(cat.getName() + " " + cat.getBreed());
    }
}
