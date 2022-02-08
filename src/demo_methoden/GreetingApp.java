package demo_methoden;

public class GreetingApp {

    public static void main(String[] args) {

        System.out.println("Before method invocation");

        greeting();

        greetPerson("Alex");
        greetPerson("Bart");

        System.out.println("After method invocation");
    }

    public static void greeting() {
        System.out.println("Hello!");
    }

    public static void greetPerson(String name) {
        System.out.println("Hello, " + name);
    }
}
