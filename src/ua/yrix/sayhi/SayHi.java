package ua.yrix.sayhi;

import java.util.Scanner;

public class SayHi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number or press 'q' to exit the program:");

        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("q")) {
            System.out.println("Program exited by user!");
            System.exit(0);
        }

        int number = Integer.parseInt(userInput);
        if (number % 2 == 0) {
            System.out.println("You entered even number.");
        } else {
            System.out.println("You entered non-even number.");
        }

        scanner.close();
    }

}
