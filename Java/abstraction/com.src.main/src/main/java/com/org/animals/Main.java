package com.org.animals;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("wolf", "large", 123.2);
//        dog.makeNoise();

        Cat cat = new Cat("munchkin", "medium", 14.0);
//        cat.makeNoise();

        doAnimalStuff(dog);
        doAnimalStuff(cat);
        System.out.println(cat.getExplicitType());

        List<Animal> animals = List.of(dog,
                new Dog("German Shepard", "big", 120.0),
                new Fish("Goldfish", "small", 0.1),
                new Fish("Shark", "medium", 22.3),
                new Horse("Albin", "big", 125.2)
        );
        animals.forEach(animal -> {
            doAnimalStuff(animal);
            if (animal instanceof Mammel currentMammel) {
                currentMammel.shedHair();
            }
        });
    }

    // polymorphism
    private static void doAnimalStuff(Animal animal) {
        animal.move("fast");
//        animal.makeNoise();
        System.out.println(animal.getExplicitType());
    }

}