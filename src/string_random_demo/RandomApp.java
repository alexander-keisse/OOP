package string_random_demo;

import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();
        System.out.println("Object reference: " + randomNumberGenerator);

        for (int i = 0; i < 5; i++) {
            System.out.println("Random int value: " + randomNumberGenerator.nextInt());
        }

        Random randomWithSeed;
        long seed = 14;

        randomWithSeed = new Random(seed);
        Random randomWithSameSeed = new Random(seed);

        System.out.println(randomWithSeed + ": " + randomWithSeed.nextInt() + ", " + randomWithSameSeed + ": "
                                + randomWithSameSeed.nextInt());

        long randomLong = randomNumberGenerator.nextLong();
        double randomDouble = randomNumberGenerator.nextDouble();
        boolean randomBoolean = randomNumberGenerator.nextBoolean();

        System.out.println("Random long: " + randomLong);
        System.out.println("Random double: " + randomDouble);
        System.out.println("Random boolean: " + randomBoolean);

        int positiveNumber = randomNumberGenerator.nextInt(10);
        System.out.println(positiveNumber);
    }
}
