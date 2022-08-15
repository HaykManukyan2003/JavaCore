package folders.studentGrade;

public class Student {

    private String name;
    private double average;

    Student(String name, double average) { this.name = name; if (average > 0.0 && average <= 100.0 ) this.average = average; }

    public void setName(String name) { this.name = name; }
    public void setAverage(double average) { this.average = average; }

    public String getName() { return this.name; }
    public double getAverage() { return this.average; }

    public String getLetterGrade() {
        String letterGrade = "";

        if (average >= 90.0) letterGrade = "A";
        else if (average >= 80) letterGrade = "B";
        else if (average >= 70) letterGrade = "C";
        else if (average >= 60) letterGrade = "D";
        else letterGrade = "F";

        return letterGrade;
    }

    public static double getAverageGradeOfStudents(Student account1, Student account2, Student account3, Student account4) {
        return (account1.average + account2.average + account3.average + account4.average) / 4;
    }

}
