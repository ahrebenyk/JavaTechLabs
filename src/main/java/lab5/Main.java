package lab5;

import java.util.Collections;
import java.util.Comparator;

public class Main {

    static void main() {
        Student st1 = new Student("Ігор", -21, "igor@gmail.com", "1", 100);
        Student st2 = new Student("Андрій", 22, "andriygmail.com", "2", 90);
        Student st3 = new Student("Максим", 22, "maksym@gmail.com", "3", 50);

        Teacher teacher = new Teacher("Олег", 43, "oleg@gmail.com", "OOP", 4);
        teacher.promote();
        teacher.displayInfo();

        Group group = new Group();
        group.addStudent(st1);
        group.addStudent(st2);
        group.addStudent(st3);

        st1.upgradeGrade(96);
        st2.upgradeGrade(100);
        st3.upgradeGrade(100);

        Collections.sort(group.getStudents(), Comparator.comparingDouble(Student::getAverageGrade).reversed());
        group.printAll();
    }
}
