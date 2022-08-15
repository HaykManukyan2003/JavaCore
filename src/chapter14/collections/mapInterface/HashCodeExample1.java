package chapter14.collections.mapInterface;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {

    public static void main(String[] args) {

        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Hayk", "Manukyan", 2);
        Student st2 = new Student("Vahagn", "Manukyan", 0);
        Student st3 = new Student("GG", "yo", 4);
        map.put(st1, 8.4);
        map.put(st2, 6.2);
        map.put(st3, 5.45);
        System.out.println(map);


        Student st4 = new Student("Hayk", "Manukyan", 2);
        boolean result = map.containsKey(st4);
        System.out.println(result);

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st4.hashCode());

    }
}

final class Student implements Comparable<Student> {

    final private String name;
    final private String surname;
    final private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.name.compareTo(o.name);
    }
}
