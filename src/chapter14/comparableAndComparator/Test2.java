package chapter14.comparableAndComparator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(300, "ava", "yan", 400000);
        Employee emp2 = new Employee(5, "gugu", "yangu", 300000);
        Employee emp3 = new Employee(98, "ava", "yanru", 5400000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println("before sorting " + employees);

        Collections.sort(employees, new IdComparator());
        System.out.println("after sorting " + employees);
    }
}

class Employee
        //implements Comparable<Employee>
{

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(@NotNull Employee anotherEmp) {
//        //return Integer.compare(this.id, anotherEmp.id);
//        int result = this.name.compareTo(anotherEmp.name);
//        if (result == 0) {
//            result = this.surname.compareTo(anotherEmp.surname);
//        }
//        return result;
//    }

}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.id, emp2.id);
    }

}
