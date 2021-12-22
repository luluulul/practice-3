package ru.mirea.prac3;

public class Test {
    public static void main(String[] args) {
        Shape g1 = new Circle(5.5, "RED", false);
        System.out.println(g1);
        Square sq1 = new Square(5);
        System.out.println(sq1);
        MovableCircle mc1 = new MovableCircle(1 ,1 ,1,1,5);
        System.out.println(mc1);
        mc1.moveDown();
        mc1.moveDown();
        mc1.moveDown();
        System.out.println(mc1);

// Закомментированы ошибочные строки по заданию





    }
}
