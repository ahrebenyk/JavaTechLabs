package lab5;

import java.util.ArrayList;
import java.util.List;

import static java.lang.IO.println;

public class Group {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void printAll() {
        println("Всі студенти групи:");
        students.forEach(Student::displayInfo);
    }

    public void findExcellentStudents() {
        println("Студенти відмінники:");
        students.stream()
                .filter(Student::isExcellentStudent)
                .forEach(Student::displayInfo);
    }

    public List<Student> getStudents() {
        return students;
    }
}
