package com.org.animals;
public class Horse extends Mammel {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds fur in the spring");
    }

    @Override
    public void makeNoise() {
    }
}
