package DevelhopeJavaOPPAdvanced;

public class Animal {
    private String animalName;

    public Animal(String name) {
        this.animalName = name;
    }

    public void animalSound() {
        System.out.println("Animal makes sound");
    }
}

    class Lion extends Animal {
        public Lion(String name) {
            super(name);
        }
        @Override
        public void animalSound() {
            System.out.println("Lion roars");
        }
    }

    class Cow extends Animal {
        public Cow(String name) {
            super(name);
        }
        @Override
        public void animalSound() {
            System.out.println("Cow Mows");
        }
    }
