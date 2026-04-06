package lab5;

public class Teacher extends Person {
    private final String subject;
    private int experienceYears;

    public Teacher(String name, int age, String email, String subject, int experienceYears) {
        super(name, age, email);
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public void promote() {
        experienceYears ++;
    }

    @Override
    public void displayInfo() {
        IO.println("Викладач:");
        super.displayInfo();
        IO.println("Предмет: %s\nСтаж: %s\n".formatted(subject, experienceYears));
    }
}
