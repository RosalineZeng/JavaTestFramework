package com.hello.demo.LearnJava;

public class Bird {
    private String type;
    private double weight;
    private String color;

    public Bird(String type, double weight, String color) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    public void printBird() {
        System.out.println("type: " + type + ", weight: " + weight + ", color: " + color);
    }
}
