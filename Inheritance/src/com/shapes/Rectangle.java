package com.shapes;

public class Rectangle implements Quadilateral {
    private double length;
    private double breadth;

    public Rectangle(double length, double side){
        this.length = length;
        breadth = side;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateArea(){
        return length * breadth;
    }

}
