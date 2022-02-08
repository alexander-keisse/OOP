package solutions_methoden;

public class Opdracht5 {

    public static void main(String[] args) {

        for (int i = 2; i < 500; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
