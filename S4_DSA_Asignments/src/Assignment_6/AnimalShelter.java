package Assignment_6;

import Assignment_6.Animals.Cat;
import Assignment_6.Animals.Dog;
import Assignment_6.Animals.Animal;

import java.util.LinkedList;
import java.util.Queue;

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

    // dequeue any
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
}
