package chapter14.collections.listInterface.example2;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods {

    public static void main(String[] args) {

        Student student1 = new Student("A", 'm', 28, 2, 9.5);
        Student student2 = new Student("B", 'f', 20, 76, 5.7);
        Student student3 = new Student("C", 'm', 17, 55, 2.8);
        Student student4 = new Student("D", 'f', 78, 34, 7.3);

        Student student5 = new Student("A", 'm', 28, 2, 9.5);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        //students.remove(student5);   // remove method;
        //System.out.println(students);

        int index = students.indexOf(student5);
        System.out.println(index);
    }
}

class Student {

    private String name;
    private char gender;
    private int age;
    private int course;
    private double averageGrade;

    public Student(String name, char gender, int age, int course, double averageGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gender == student.gender && age == student.age && course == student.course && Double.compare(student.averageGrade, averageGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
