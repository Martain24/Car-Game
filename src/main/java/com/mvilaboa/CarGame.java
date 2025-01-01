package com.mvilaboa;


import java.util.Scanner;

public class CarGame {

    public static void showCarGameRules(Car car) {
        System.out.println("1. Type 'run' to start the " + car.getCarBrand());
        System.out.println("2. Type 'stop' to stop the " + car.getCarBrand());
        System.out.println("3. Type 'help' to get help.");
        System.out.println("4. Type 'exit' to exit the game.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your car's brand: ");
        Car userCar = new Car(scanner.nextLine());
        showCarGameRules(userCar);

        while (true) {
            System.out.print("-> ");
            String userInput = scanner.nextLine();

            switch (userInput.toLowerCase()) {
                case "run" -> userCar.run();
                case "stop" -> userCar.stop();
                case "help" -> showCarGameRules(userCar);
                case "exit" -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("== Invalid command. Please try again or type 'help' if you need help ==");
            }
        }

    }
}