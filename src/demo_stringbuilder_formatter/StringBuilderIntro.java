package demo_stringbuilder_formatter;

public class StringBuilderIntro {

    public static void main(String[] args) {

        // Create a StringBuilder object using default constructor

        StringBuilder builder1 = new StringBuilder();
        builder1.append("AAABBBCCC");

        // print out

        System.out.println(builder1);

        // Create StringBuilder object using StringBuilder(CharSequence) constructor

        StringBuilder builder2 = new StringBuilder(builder1);

        builder2.append("DDDEEEFFF");  // builder1 remains the same
        System.out.println(builder2);

        // Create a StringBuilder object using StringBuilder(int capacity)

        StringBuilder builder3 = new StringBuilder(10);

        // print out

        System.out.println("default capacity: " + new StringBuilder().capacity());

        System.out.println("builder3 length: " + builder3.length());

        builder3.append("123456789101");

        System.out.println("builder3 capacity: " + builder3.capacity());

        // Execution time difference

        String s1 = "";

        long startTime = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            s1 += i;
        }

        long endTime = System.nanoTime();
        System.out.println("Execution time String concatenation: " + (endTime - startTime) / 1_000_000 + "ms");

        StringBuilder sb = new StringBuilder();

        startTime = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            sb.append(i);
        }

        endTime = System.nanoTime();
        System.out.println("Execution time StringBuilder concatenation: " + (endTime - startTime) / 1_000_000 + "ms");

    }

}
