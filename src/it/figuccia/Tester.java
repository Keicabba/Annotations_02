package it.figuccia;

public class Tester {
    public static void main(String[] args) throws Exception {
        Greetings greetings = new Greetings();
        greetings.sayWelcome();
        greetings.sayGoodbye();

        // retrieve and print the DevAnnotation values for the sayWelcome method
        DevAnnotation devAnnotation1 = Greetings.class.getDeclaredMethod("sayWelcome").getAnnotation(DevAnnotation.class);
        System.out.println("The sayWelcome method was written by " + devAnnotation1.DevName() + " " + devAnnotation1.DevSurname());

        // retrieve and print the DevAnnotation values for the sayGoodbye method
        DevAnnotation devAnnotation2 = Greetings.class.getDeclaredMethod("sayGoodbye").getAnnotation(DevAnnotation.class);
        System.out.println("The sayGoodbye method was written by " + devAnnotation2.DevName() + " " + devAnnotation2.DevSurname());
    }
}
