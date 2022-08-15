package lambda;

import java.util.ArrayList;

public class StudentInfo {

    public  void checkStudent(ArrayList<Student> arrayList, validate validate) {
        for(Student s : arrayList) {
            if (validate.validate(s)) System.out.println(s);
        }
    }

    public static void main(String[] args) {

        Student st1 = new Student("Hayk", 'M', 19, 3, 20.0);
        Student st2 = new Student("Poncho", 'M', 13, 2, 8.9);
        Student st3 = new Student("Raf", 'M', 14, 6, 4.8);
        Student st4 = new Student("Gag", 'M', 14, 4, 5.7);
        Student st5 = new Student("Vahan", 'M', 9, 8, 2.8);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        //info.checkStudent();

    }
}

interface validate {
    boolean validate(Student student);
}
