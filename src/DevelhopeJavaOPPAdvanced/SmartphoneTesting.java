package DevelhopeJavaOPPAdvanced;

public class SmartphoneTesting {
    public static void main(String[] args) {
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 400.0);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 600.0);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 450.0);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 650.0);

        Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S21", 5000, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Apple", "iPhone 12", 4000, producerPrice2, retailPrice2);

        System.out.println("Smartphone 1 Details:\n" + smartphone1);
        System.out.println("\nSmartphone 2 Details:\n" + smartphone2);

        if (smartphone1.equals(smartphone2)) {
            System.out.println("\nSmartphones are equal.");
        } else {
            System.out.println("\nSmartphones are not equal.");
        }

        try {
            Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();
            System.out.println("\nCloned Smartphone Details:\n" + clonedSmartphone);

            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("\nOriginal Smartphone and Cloned Smartphone are equal.");
            } else {
                System.out.println("\nOriginal Smartphone and Cloned Smartphone are not equal.");
            }
        } catch (CloneNotSupportedException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
