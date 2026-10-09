package org.example;

public class Main {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        double celsius = 25;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
    }
}

