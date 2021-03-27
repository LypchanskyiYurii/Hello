package ua.yrix.sayhi;

import java.util.Scanner;

public class SayHi {
    public static void main(String[] args) {
        System.out.println("_______________");
        System.out.println("Hello world");
        System.out.println("_______________");

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number = scaner.nextInt();
        while (true) {
            if (number % 2 == 0) {
                System.out.println("Ви ввели парне число");
                break;
            } else System.out.println("Ви ввели не парне число");
            break;
        }
    }
}
