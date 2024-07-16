package com;

public class Calculator {
    static double radius;
    public static double PI = 3.142;

    public void AreaOfTheCircle(){
        double area = PI * radius * radius;
        System.out.println("AREA OF THE CIRCLE IS : " + area);
    }

    public void CircumferenceOfTheCircle(){
        double circum = 2 * PI * radius;
        System.out.println("CIRCUMFERENCE OF THE CIRCLE IS : " + circum);
    }

    public static void main(String[] args) {
        Calculator circle = new Calculator();
        circle.radius = 5;
        circle.AreaOfTheCircle();
        circle.CircumferenceOfTheCircle();

    }
}
