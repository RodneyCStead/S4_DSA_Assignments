package Assignment_6;

import Assignment_6.Animals.Cat;
import Assignment_6.Animals.Dog;
import Assignment_6.Animals.Animal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    public Queue<Dog> dogs;
    public Queue<Cat> cats;


    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();

    }

    // enqueue
    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }

    // dequeue any (choose to select the oldest cat vs the oldest dog if timestamp is same)
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else {
            Dog dog = dogs.peek();
            Cat cat = cats.peek();
            if (dog.getTimestamp() < cat.getTimestamp()) {
                return dogs.poll();
            } else {
                return cats.poll();
            }
        }
    }

    // dequeue dogs
    public Dog dequeueDog() {
        return dogs.poll();
    }

    // dequeue for cats
    public Cat dequeueCat() {
        return cats.poll();
    }

    public List<Animal> listAllAnimals() {
        List <Animal> allAnimals = new ArrayList<>();
        allAnimals.addAll(dogs);
        allAnimals.addAll(cats);
        return allAnimals;
    }

    public void printAllAnimals() {
        System.out.println("Animals in the shelter:");
        for (Animal animal : listAllAnimals()) {
            System.out.println("Animal Name: " + animal.getName() + " ||" + " Type: " + animal.getClass().getSimpleName());
        }
    }


}
