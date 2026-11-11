package day17.methods;

public class returnKeywordExample {
    public static void main(String[] args) {
        String fullName = createFullName("Julian", "Sison");
        System.out.println("Full Name: " + fullName);
        System.out.println(createGreeting("Winter"));
    }

    public static String createGreeting(String name) {
        return "Hello, " + name + "\nWelcome to Java!";
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
