package com.org.animals;

public class Cat extends Animal {
    public Cat(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(this.type+" is ");
        switch(this.type){
            case "slow" -> System.out.println("pacing");
            case "average" -> System.out.println("walking");
            default -> System.out.println("running");
        }
        System.out.println(); // Add this line to print a newline
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

}
