package com.shapes;

public class Square implements Quadilateral{
    private double side;

    public void setSide(int side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public Square(double sideLength){
        this.side = sideLength;
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
}
