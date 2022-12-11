package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        add();
        delete();
        multiply();
    }

    public static void add() {
        System.out.println("Please enter your first number :");
        Scanner input =  new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Please enter your second number :");
        int secondNumber = input.nextInt();

        System.out.println("Please enter your third number :");
        int thirdNumber = input.nextInt();

        int total = firstNumber + secondNumber + thirdNumber;
        System.out.println("The total is: " + total);
    }

    public static void delete() {
        System.out.println("Please enter your first number :");
        Scanner input =  new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Please enter your second number :");
        int secondNumber = input.nextInt();

        System.out.println("Please enter your third number :");
        int thirdNumber = input.nextInt();

        int total = firstNumber + secondNumber + thirdNumber;
        System.out.println("The total is: " + total);
    }

    public static void multiply() {
        System.out.println("Please enter your first number :");
        Scanner input =  new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Please enter your second number :");
        int secondNumber = input.nextInt();

        System.out.println("Please enter your third number :");
        int thirdNumber = input.nextInt();

        int total = firstNumber + secondNumber + thirdNumber;
        System.out.println("The total is: " + total);
    }
}
