package folders.healthProfile;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double heightInInches;
    private double weightInPounds;

    HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, double heightInInches, double weightInPounds) {

        this.firstName = firstName;
        this.lastName = lastName;
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) this.gender = gender;
        if (dayOfBirth > 0 && dayOfBirth <= 31) this.dayOfBirth = dayOfBirth;
        if (monthOfBirth > 0 && monthOfBirth <= 12) this.monthOfBirth = dayOfBirth;
        if (yearOfBirth >= 1890 && yearOfBirth <= 2021) this.yearOfBirth = yearOfBirth;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;

    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGender(String gender) { this.gender = gender; }
    public void setDayOfBirth(int dayOfBirth) { this.dayOfBirth = dayOfBirth; }
    public void setMonthOfBirth(int monthOfBirth) { this.monthOfBirth = monthOfBirth; }
    public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }
    public void setHeightInInches(double heightInInches) { this.heightInInches = heightInInches; }
    public void setWeightInPounds(double weightInPounds) { this.weightInPounds = weightInPounds; }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }
    public int getDayOfBirth() { return dayOfBirth; }
    public int getMonthOfBirth() { return monthOfBirth; }
    public int getYearOfBirth() { return yearOfBirth; }
    public double getHeightInInches() { return heightInInches; }
    public double getWeightInPounds() { return weightInPounds; }



}
