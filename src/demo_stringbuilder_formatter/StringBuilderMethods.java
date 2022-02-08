package demo_stringbuilder_formatter;

public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello World");

        int offset = sb.indexOf("World");
        sb.insert(offset, "Big ");

        System.out.println(sb);

        StringBuilder sentence = new StringBuilder();
        sentence.append("This ").append("is ").append("method ").append("chaining!");
        System.out.println(sentence);

        // Any changes that we make to this object will also be affecting our original sentence obj.
        StringBuilder copy = sentence;

        // Uppercase [hard way]
        for (int i = 0; i < copy.length(); i++) {

            char upperCaseChar = Character.toUpperCase(sentence.charAt(i));
            copy.setCharAt(i, upperCaseChar);
        }

        System.out.println(copy);

        // Lowercase workaround
        String toLowerCase = sentence.toString().toLowerCase();
        sentence = new StringBuilder(toLowerCase);

        System.out.println("Some methods from String are not available in StringBuilder " +
                            "[But we can convert them easily]: " + sentence);


        // Reverse internal value
        sentence.reverse();
        System.out.println("Reversed internal value: " + sentence);

        // Delete all characters
        for (int i = 0; i < copy.length(); i++) {
            copy.deleteCharAt(0);
        }

        System.out.println("copy StringBuilder: " + copy);

        // If you want delete a bigger portion, you can use this method.
        sb.delete(0, sb.length());
        System.out.println("sb StringBuilder: " + sb);

        // What the compiler does in the background with concatenation
        String firstName = "Alex ";
        String lastName = "Keisse";

        String fullName = firstName + lastName;
        System.out.println("String concatenation: " + fullName);

        fullName = new StringBuilder().append(firstName).append(lastName).toString();
        System.out.println("StringBuilder concatenation: " + fullName);
    }

}
