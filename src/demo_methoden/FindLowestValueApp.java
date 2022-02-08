package demo_methoden;

import java.util.Scanner;

public class FindLowestValueApp {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        final String ASK_INPUT = "Fill in a number please";

        System.out.println(ASK_INPUT);
        int firstNumb = kbd.nextInt();

        System.out.println(ASK_INPUT);
        int secondNumb = kbd.nextInt();

        int lowestValue = findLowestValue(firstNumb, secondNumb);
        System.out.println(lowestValue);

    }

    public static int findLowestValue(int firstNumber, int secondNumber) {

        // return (firstNumber > secondNumber) ? secondNumber : firstNumber;

        return Math.min(firstNumber, secondNumber);
    }
}
