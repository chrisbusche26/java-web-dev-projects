package org.launchcode;

import java.util.Scanner;


public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        //String radius = input.nextLine();

        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
            if (radius > 0) {
                input.close();
                Double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is " + area);
            } else {
                System.out.println("Enter positive number.");
            }

        } else {
            System.out.println("Enter a number.");
        }


        //double area = 3.14 * (radius * radius);

    }
}
