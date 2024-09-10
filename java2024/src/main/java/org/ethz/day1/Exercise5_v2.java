package org.ethz.day1;

import java.util.Scanner;

public class Exercise5_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Input desired integer: ");

    int complicated = input.nextInt();
    input.close();
    
    int product = 1;
    for(int range = 1; complicated >= range; range = range * 10) {
        product = ( complicated % ( range * 10 ) - complicated % range) * product / range;
        }
    System.out.println("The product equals " + product);
    } 
}