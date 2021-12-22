package ru.mirea.prac3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle(){
        width = 1;
        length = 1;
        color = "000000";
        filled = false;
    }

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        color = "000000";
        filled = false;
    }
    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return width*2+length*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
