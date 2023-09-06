package DevelhopeJavaOPPAdvanced;

public class AnimalTesting {
    public static void main( String[] args){
        Animal animal = new Animal("Unidentified");
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Cowsie");
        animal.animalSound();
        cow.animalSound();
        lion.animalSound();
    }
}
