package folders.employee;

import static folders.employee.Employee.getCount;

import static java.lang.Math.*;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Frank", "Austin", 450);
        Employee employee2 = new Employee("George", "Freedman", 1);

        System.out.println(employee2.getMonthlySalary());

        System.out.println(employee1.getMonthlySalary());
        employee1.getYearlySalary();
        employee1.getYearlySalaryRaisedByTenPercent();

        System.out.println(employee2.getMonthlySalary());
        employee2.getYearlySalary();
        employee2.getYearlySalaryRaisedByTenPercent();

        Employee.displayEmployeeInfo(employee1);

        employee1.show();

        System.out.println(Employee.getCount());

        Employee employee44 = new Employee("Hayk", "Manukyan", 700000);
        Employee employee45 = new Employee("Hayk", "Manukyan", 700000);

        System.out.println(getCount());

        System.out.println(max(3, 44));

    }
}
