package it.figuccia;

public class Greetings {

    @DevAnnotation(DevName = "John", DevSurname = "Walker")
    public void sayWelcome() {
        System.out.println("Welcome!");
    }

    @DevAnnotation(DevName = "Mark", DevSurname = "Brown")
    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}
