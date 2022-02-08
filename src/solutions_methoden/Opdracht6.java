package solutions_methoden;

import java.util.Scanner;

public class Opdracht6 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = kbd.nextInt();

        if (isPalindrom(number)) {
            System.out.println("Number is palindrom.");
        } else {
            System.out.println("Number is not palindrom.");
        }

        kbd.close();

    }

    private static boolean isPalindrom(int number) {

        int temp = number;
        int remainder;
        int reverse = 0;

        while (temp > 0) {
            remainder = temp % 10;
            temp /= 10;
            reverse = (reverse * 10) + remainder;
        }

        return reverse == number;
    }

}
