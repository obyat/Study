package com.org.animals;
abstract class Mammel extends Animal {
    public Mammel(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed){
        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}

public abstract class Animal {
    protected String type;
    protected String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    // cannot be modified in extending classes
    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ") ";
    }
}
