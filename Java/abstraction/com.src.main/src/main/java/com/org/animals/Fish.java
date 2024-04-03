package com.org.animals;

public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(this.type+" is ");
        switch(this.type){
            case "slow" -> System.out.println("splashing");
            case "average" -> System.out.println("zooming");
            default -> System.out.println("speeding");
        }
        System.out.println(); // Add this line to print a newline
    }

    @Override
    public void makeNoise() {
        System.out.println("blop");
    }

}
