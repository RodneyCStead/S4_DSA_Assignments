package Assignment_6;

import Assignment_6.Animals.*;


public class Main {
    public static void main(String[] args) {

        AnimalShelter shelter = new AnimalShelter();

        // Adding animals to the shelter through enqueue
        System.out.println("Animals available in the shelter: ");
        shelter.enqueue(new Dog("Daya"));
        shelter.enqueue(new Dog("Dovah"));
        shelter.enqueue(new Dog("Rex"));
        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Dog("Max"));
        shelter.enqueue(new Cat("Boots"));
        shelter.enqueue(new Cat("Vader"));
        shelter.enqueue(new Cat("Mittens"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Cat("Fluffy"));

        // list of animals before dequeing
        shelter.printAllAnimals();

        // Dequeing any animal
        System.out.println("");
        System.out.println("Dequeueing any animal: " + shelter.dequeueAny().getName());
        shelter.dequeueAny();
        shelter.printAllAnimals();

        // Dequeing a dog
        System.out.println("");
        System.out.println("Dequeueing any dog: " + shelter.dequeueDog().getName());
        shelter.dequeueDog();
        shelter.printAllAnimals();

        // Dequeing a cat
        System.out.println("");
        System.out.println("Dequeueing any cat: " + shelter.dequeueCat().getName());
        shelter.dequeueCat();
        shelter.printAllAnimals();

        
    }
}
