package solutions_methoden;

import java.util.Scanner;

public class Opdracht2 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        final String ASK_FOR_INPUT = "Input a number: ";

        System.out.print(ASK_FOR_INPUT);
        double number1 = kbd.nextDouble();

        System.out.print(ASK_FOR_INPUT);
        double number2 = kbd.nextDouble();

        System.out.print(ASK_FOR_INPUT);
        double number3 = kbd.nextDouble();

        System.out.println("The average of given numbers is: " + average(number1, number2, number3));

        kbd.close();
    }

    public static double average(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }

}
