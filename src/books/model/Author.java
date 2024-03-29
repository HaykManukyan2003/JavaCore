package books.model;

import books.enumeration.Gender;

import java.util.Date;

import static books.util.DateUtil.dateToString;

public class Author {

    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private Date registeredDate;

    public Author() {
    }

    public Author(String name, String surname, String email, Gender gender, Date registeredDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = Gender.valueOf(String.valueOf(gender));
        this.registeredDate = registeredDate;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email=" + email +
                ", gender='" + gender + '\'' +
                ", registeredDate='" + dateToString(registeredDate) + '\'' +
                '}';
    }

}
