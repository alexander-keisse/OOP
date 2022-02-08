package demo_stringbuilder_formatter;

import java.util.Formatter;

public class FormatterApp {

    public static void main(String[] args) {

        /*
        Often times we want to print our text in a elegant way,
        for this we can make use of the Formatter class in Java.
         */

        // We can make a formatter object as follows
        Formatter formatter = new Formatter();

        // The most important method is the format method

        String text = "I'm %d years old!";  // We are using a format specifier here %d [decimal] which marks a gap
        formatter.format(text, 31);  // We give our String a value with a gap, the second argument will fill the gap

        System.out.println(formatter.toString());

        // A formatter works with a buffer, so if we want to use it again
        formatter.close();
        formatter = new Formatter();

        // We can have multiple format specifiers in a String
        text = "I'm %d years old and I'm %f m tall";  // We are using the format specifier for a float value here
        formatter.format(text, 31, 1.87);  // ctrl + click on method format, observe the method takes multiple arguments

        System.out.println(formatter.toString());

        // If we want our resulting float number with only 2 digits after comma
        text = "I'm %d years old and I'm %.2f tall";

        formatter = resetFormatter(formatter);
        formatter.format(text, 31, 1.87);

        System.out.println(formatter);

        /*
        The syntax of using a format specifier

        % [index] [flags] [width] [.precision] conversion

        The things between brackets are optional

        Conversion

        b   boolean
        c   character
        d   integer
        f   floating point
        s   String
        n   newline
         */

        formatter = resetFormatter(formatter);

        // Arguments are given in the same order as format specifiers are defined [no argument necessary for %n]
        formatter.format("%b %c %d %f %s %n", true, 'a', 12, 45.2, "hello");
        System.out.println(formatter);

        formatter = resetFormatter(formatter);

        // You can also define in which order you give the arguments
        formatter.format("%3$d %5$s %1$b %2$c %4$f %n", true, 'a', 12, 45.2, "hello");  // 3$ to declare index
        System.out.println(formatter);

        /*
        Flags

        -   Aligns the value to the left
        +   Provide a number with a + or - sign
        0   Fills a number at the front with zeros
        ,   Uses comma for separating thousands
        (   Place negative numbers in parentheses

         */

        formatter = resetFormatter(formatter);

        formatter.format("%(d %+d %,d", -125, 145, 123456789);
        System.out.println(formatter);

        /*
        Finally, we can also provide a width and precision.

        With width we indicate the minimum number of characters to be printed and
        precision can be used for the number of digits after the comma
         */
        formatter = resetFormatter(formatter);

        formatter.format("%-6d %06d %.2f", -125, 145, 123.569874);
        System.out.println(formatter);

        /*
        If we are just printing to the console,
        we could also use the special print methods for that.

        This method internally makes use of a formatter
         */
        System.out.printf("%s", "End of demo");
    }

    public static Formatter resetFormatter(Formatter formatter) {

        formatter.close();
        return new Formatter();
    }

}
