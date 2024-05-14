package org.launchcode;

import java.util.Scanner;

public class NumericTypesMilesDriven {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        Double numMiles = input.nextDouble();

        System.out.println("How many gallons of gas have been used?: ");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + " mpg");

    }
}
