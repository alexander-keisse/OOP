package string_random_demo;

public class StringExample {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 and s2 are referencing the same object: " + (s1 == s2));
        System.out.println("s1 and s3 are referencing the same object: " + (s1 == s3));

        System.out.println("Have the same internal value: " + s1.equals(s2));
        System.out.println("Have the same internal value: " + s1.equals(s3));

        // Some popular String methods:

        char l = s1.charAt(2);
        System.out.println("Char at index 2 [we start counting from 0]: " + l);

        String concatenatedString = s1.concat(s2);
        System.out.println("String 1 + String 2: " + concatenatedString);

        int pos = s1.indexOf(l);
        System.out.println("First occurence of char 'l': " + pos);

        int offset = pos + 1;
        System.out.println("Second occurence of char 'l': " + s1.indexOf(l, offset));

        String username = "RastaLion";

        String lowerCaseUsername = username.toLowerCase();
        System.out.println("Lowercase username: " + lowerCaseUsername);

        String upperCaseUsername = username.toUpperCase();
        System.out.println("Uppercase username: " + upperCaseUsername);

        String fullAddress = "Rouppeplein 16, Brussel 1000 Belgium";
        String streetSubstring = fullAddress.substring(0, fullAddress.indexOf(','));

        System.out.println("INTEC BRUSSEL can be found at: " + streetSubstring);

        String name = "Alexander Keisse";

        if (name.startsWith("Alexander")) {
            name = name.replace("Alexander", "Elliot");

        }

        if (name.endsWith("Keisse")) {
            name = name.replace("Keisse", "Alderson");
        }

        System.out.println("My name is: " + name);
    }

}
