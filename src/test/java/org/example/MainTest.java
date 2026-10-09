package org.example;
import java.util.Scanner;
public class Main {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("     TEMPERATURE CONVERTER");
        System.out.println("================================");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("--------------------------------");
            System.out.printf("Celsius     : %.2f°C%n", celsius);
            System.out.printf("Fahrenheit  : %.2f°F%n", fahrenheit);
            System.out.println("--------------------------------");
            System.out.println("Conversion completed successfully!");
        } else if (choice == 2) {
            System.out.println("Thank you for using the application!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
        sc.close();
    }
}

