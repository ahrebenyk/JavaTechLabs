package lab5;

import static java.lang.IO.println;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        setAge(age);
        setEmail(email);
        setName(name);
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            println("Некоректне значення віку %s".formatted(age));
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email !=null && !email.contains("@")) {
            println("Некоректне значення значення імейлу %s".formatted(email));
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        println("Ім'я: %s\nВік: %s\nEmail: %s".formatted(name, age, email));
    }
}
