package chapter8.inheritance.abstractClasses.employee;

public class PayrollSystemTest {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith",
                "111-11-1111", 800.00);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price",
                "222-22-2222", 16.75, 40);

        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones",
                "333-33-3333", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob",
                "Lewis", "444-44-4444", 5000, .04, 300);

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            // downcast Employee reference to BasePlusCommissionEmployee reference;
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10 percent increase is: $%.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.getPaymentAmount());

        }

        for (int k = 0; k < employees.length; k++) {
            System.out.printf("Employee %d is a %s%n", k, employees[k].getClass().getName());
        }


        Payable[] payableObjects = new Payable[4];
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);

        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }

    }
}
