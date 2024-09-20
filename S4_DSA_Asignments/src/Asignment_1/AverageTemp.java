package Asignment_1;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageTemp {
    private final ArrayList<Double> temperatures = new ArrayList<>();
    private boolean isCelsius;

    // input temperature type
    public void inputTemperatureType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature type (C for Celsius, F for Fahrenheit): ");
        String type = scanner.nextLine();
        isCelsius = type.equalsIgnoreCase("C");
    }

    // input temperatures, first how many you are entering, then the temps themselves. the scanner will stop
    // asking for temps once the amount of temps entered is equal the amount you said you would enter
    public void inputTemperatures() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of temperatures: ");
        int count = scanner.nextInt();
        System.out.println("Enter the temperatures: ");
        for (int i = 0; i < count; i++) {
            temperatures.add(scanner.nextDouble());
        }
    }

    // calculate the average of the temps
    public double calculateAverage() {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.size();
    }

    // display the output
    public void displayResults() {
        double average = calculateAverage();
        System.out.println("Number of temperatures entered: " + temperatures.size());
        System.out.println("Average temperature: " + average + (isCelsius ? " °C" : " °F"));
        System.out.println("Temperatures above average: ");
        for (double temp : temperatures) {
            if (temp > average) {
                System.out.println(temp + (isCelsius ? " °C" : " °F"));
            }
        }
    }

    public static void main(String[] args) {
        AverageTemp AverageTemp = new AverageTemp();
        AverageTemp.inputTemperatureType();
        AverageTemp.inputTemperatures();
        AverageTemp.displayResults();
    }
}
