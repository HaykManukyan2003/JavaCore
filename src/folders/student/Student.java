package folders.student;

public class Student {

    private String name;
    private String surname;
    private int age;
    private int phoneNumber;
    private String city;
    private String lesson;

    public Student() {}

    public Student(String name, String surname, int age, int phoneNumber, String city, String lesson) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = Integer.parseInt(phoneNumber);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return String.format("name: %s, surname: %s, age: %d, phoneNumber: %s, city: %s, lesson: %s.",
                name, surname, age, phoneNumber, city, lesson);
    }

}
