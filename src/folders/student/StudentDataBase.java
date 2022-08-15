package folders.student;

public class StudentDataBase {

    private Student[] storage = new Student[10];
    private int size = 0;

    public void push(Student student) {
        if (size == storage.length - 1) {
            extend();
        }
        storage[size++] = student;
    }

    public void display() {
        for (int k = 0; k < size; k++) {
            System.out.println(k + ": " + storage[k]);
        }
    }

    private void extend() {
        Student[] reserveArray = new Student[storage.length * 2];
        System.arraycopy(storage, 0, reserveArray, 0, size);
        storage = reserveArray;
    }

    public int getSize() {
        System.out.print("folders.student count: ");
        return size;
    }

    public void deleteByIndex(int index) {
        if (index >= 0 && index < size) {
            for (int k = index; k < size; k++) {
                storage[index] = storage[index + 1];
            }
            size--;
            System.out.println("object deleted.");
        } else System.err.println("Index out of bounds");
    }

    public void displayStudentByLesson(String lessonName) {
        for (int k = 0; k < size; k++) {
            if (storage[k].getLesson().equalsIgnoreCase(lessonName)) {
                System.out.println(storage[k]);
            }
        }
    }

    public void changeLessonByIndex(int indexToChange, String changedLesson) {
        if (indexToChange >= 0 && indexToChange < size) {
            storage[indexToChange].setLesson(changedLesson);
            System.out.println("lesson changed.");
        } else System.err.println("Index out of bounds");
    }

}
