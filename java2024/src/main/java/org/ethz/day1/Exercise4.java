package org.ethz.day1;

import java.util.Scanner;

public class Exercise4 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");

        double radius = input.nextDouble();
        input.close();
        
        final double PI = 3.14159;
        double circumference = 2*PI*radius;
        double area = PI*radius*radius;

        System.out.println("The circle's circumference equals " + circumference);
        System.out.println("Whereas it's area equals " + area);
    }
}
