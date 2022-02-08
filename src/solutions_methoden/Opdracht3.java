package solutions_methoden;

import java.util.Scanner;

public class Opdracht3 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int number = kbd.nextInt();

        System.out.println("The sum is: " + sumDigits(number));

        kbd.close();
    }

    public static int sumDigits(int number) {
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }

}
