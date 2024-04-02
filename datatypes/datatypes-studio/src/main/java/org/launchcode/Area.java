package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        double areaOfCircle = Circle.getArea(radius);
//        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("The area of a circle of " + radius + " is: " + areaOfCircle);
        input.close();
    }





}
