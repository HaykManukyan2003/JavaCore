package folders.employee;

public class Employee {

    private static int count = 0;
    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String firstName, String lastName, double monthlySalary) {

        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 2.00) this.monthlySalary = monthlySalary;

        ++count;

    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setMonthlySalary(double monthlySalary) { this.monthlySalary = monthlySalary; }

    public static int getCount() { return count; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public double getMonthlySalary() {return this.monthlySalary; }

    public void getYearlySalary() {
        System.out.println("Employee's yearly salary is " + monthlySalary * 12 + " dollars");
    }

    public void getYearlySalaryRaisedByTenPercent() {
        System.out.printf("Employee's yearly Salary raised by ten percent is %.2f%n", (100 + 10) * ((monthlySalary * 12) / 100));
    }

    public static void displayEmployeeInfo(Employee employee) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName());
    }

    public void show() {
        System.out.println(firstName + lastName);
    }

}
