package chapter14.generics.realExample.game;



public class Test {

    public static void main(String[] args) {

        Scholar scholar1 = new Scholar("vahanchik", 9);
        Scholar scholar2 = new Scholar("rafulik", 10);
        Scholar scholar3 = new Scholar("arturik", 11);
        Scholar scholar4 = new Scholar("vladik", 8);

        Student student1 = new Student("gagulik", 14);
        Student student2 = new Student("artushik", 16);

        Employee employee1 = new Employee("rolandik", 30);
        Employee employee2 = new Employee("zidanik", 36);

        Team<Scholar> scholarTeam1 = new Team<>("Scholar team1");
        scholarTeam1.addNewParticipant(scholar1);
        scholarTeam1.addNewParticipant(scholar2);

        Team<Scholar> scholarTeam2 = new Team<>("Scholar team 2");
        scholarTeam2.addNewParticipant(scholar3);
        scholarTeam2.addNewParticipant(scholar4);

        scholarTeam1.playWith(scholarTeam2);

        Team<Student> studentTeam = new Team<>("Student team");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Employee team");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
    }
}