package demo_methoden;

public class SumApp {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        String resultMsg = "Result: ";

        int result = a + b;
        System.out.println(resultMsg + result);

        int c = 14;
        int d = 23;

        result = c + d;
        System.out.println(resultMsg + result);

        result = sum(a, c);
        System.out.println(resultMsg + result);

        result = sum(14, 25);
        System.out.println(resultMsg + result);

        float e = 14.23F;
        float f = 13.2454F;

        float floatResult = sum(e, f);
        System.out.println(resultMsg + floatResult);

        result = sum(1, 55, 83);
        System.out.println(resultMsg + result);

    }

    public static int sum(int number1, int number2) {

        int result = number1 + number2;
        return result;
    }

    /*
    Method name overloading

    De naam van de methode hoeft niet uniek te zijn, wel de naam in combinatie met het aantal
    en type van de parameters.

    We kunnen dus twee methoden definiëren met dezelfde naam maar die een verschillend aantal parameters hebben
    of die parameters van een verschillend type hebben.
     */

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static float sum(float number1, float number2) {

        float result = number1 + number2;
        return result;
    }

    // Alleen het return type aanpassen is niet voldoende!

    // public static long sum(int number1, int number2) {
    //    return (long) number1 + number2;
    //}

    // Dit kan wel omdat we nu een unieke naam + parameterlijst hebben

    public static long sum(long number1, int number2) {
        return number1 + number2;
    }
}
