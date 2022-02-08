package solutions_methoden;

import java.util.Scanner;

public class Opdracht1 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        final String ASK_FOR_INPUT = "Input a number: ";

        System.out.print(ASK_FOR_INPUT);
        double number1 = kbd.nextDouble();

        System.out.print(ASK_FOR_INPUT);
        double number2 = kbd.nextDouble();

        System.out.print(ASK_FOR_INPUT);
        double number3 = kbd.nextDouble();

        System.out.println("Smallest value that was given: " + findSmallestNumber(number1, number2, number3));

        kbd.close();
    }

    public static double findSmallestNumber(double number1, double number2, double number3) {

        double smallestNumber = number1;

        if (smallestNumber > number2) smallestNumber = number2;
        if (smallestNumber > number3) smallestNumber = number3;

        return smallestNumber;
    }

}
