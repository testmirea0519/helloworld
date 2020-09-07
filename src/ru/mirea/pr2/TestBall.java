package ru.mirea.pr2;

import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("white-black", "soccer ball");
        Ball d2 = new Ball("white-blue", "volleyball");
        Ball d3 = new Ball("orange-black", "tennisball");
        d3.setDescription("basketball");
        System.out.print("first ball: ");System.out.println(d1);
        d2.setColor("light-green");
        System.out.print("second ball: ");System.out.print(d2);
    }
}
