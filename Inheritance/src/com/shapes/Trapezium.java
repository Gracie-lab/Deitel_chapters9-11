package com.shapes;

public class Trapezium implements Quadilateral {
    private double sidea;
    private double sideb;
    private double height;

    public double getSidea() {
        return sidea;
    }

    public void setSidea(double sidea) {
        this.sidea = sidea;
    }

    public double getSideb() {
        return sideb;
    }

    public void setSideb(double sideb) {
        this.sideb = sideb;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Trapezium(double a, double b, double height){
        sidea = a;
        sideb = b;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area =  0.5*(sidea + sideb) * height;
        return area;
    }
}
