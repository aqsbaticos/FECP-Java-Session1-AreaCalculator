package org.example;

import java.util.Scanner;

public class Main {

    static double calculateCircleArea(double radius) {
        return (double) Math.PI * (radius*radius);
    }

    static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String shapeChoice = ""; double area = 0.0;
        boolean isValid = false;

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        int choice = in.nextInt();

        switch(choice) {
            case 1:
                shapeChoice = "circle";
                System.out.print("Enter the radius: ");
                double radius = in.nextDouble();
                area = calculateCircleArea(radius);
                isValid = true;
                break;
            case 2:
                shapeChoice = "triangle";
                System.out.print("Enter the base: ");
                double base = in.nextDouble();
                System.out.print("Enter the height: ");
                double height = in.nextDouble();
                area = calculateTriangleArea(base, height);
                isValid = true;
                break;
            case 3:
                shapeChoice = "rectangle";
                System.out.print("Enter the radius: ");
                double length = in.nextDouble();
                System.out.print("Enter the radius: ");
                double width = in.nextDouble();
                area = calculateRectangleArea(length, width);
                isValid = true;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (isValid) {
            System.out.print("Area of the " + shapeChoice + ": ");
            System.out.printf("%.2f\n", area);
        }
    }
}