package ru.mirea.prac3;

public class Square extends Rectangle{
    protected double side;
    Square(){
        side = 1;
        color = "000000";
        filled = false;
    }
    Square(double side){
        this.side = side;
        color = "000000";
        filled = false;
    }
    Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
