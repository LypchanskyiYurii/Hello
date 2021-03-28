package ua.com.yurii.basics;

import java.util.Scanner;

public class OddEvenNumberChecker {

    public static void main(String[] args) {
        runNumberChecks();
    }

    private static void runNumberChecks() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number or press 'q' to exit the program:");
            String userInput = scanner.nextLine();


            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Program exited by user!");
                scanner.close(); // It's useless here, but let keep it ;)
                System.exit(0);
            }

            int number = Integer.parseInt(userInput);
            if (number % 2 == 0) {
                System.out.println("You entered even number.");
            } else {
                System.out.println("You entered non-even number.");
            }
        }
    }

}
