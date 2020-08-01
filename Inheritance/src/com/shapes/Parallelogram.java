package com.shapes;

public class Parallelogram implements Quadilateral {
    private double base;
    private double height;

    public Parallelogram(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}
