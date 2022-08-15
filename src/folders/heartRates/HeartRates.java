package folders.heartRates;
public class HeartRates {

    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    HeartRates(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        if (dayOfBirth > 0 && dayOfBirth <= 31) this.dayOfBirth = dayOfBirth;
        if (monthOfBirth > 0 && monthOfBirth <= 12) this.monthOfBirth = monthOfBirth;
        if (yearOfBirth >= 1890 && yearOfBirth <= 2021) this.yearOfBirth = yearOfBirth;

    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setDayOfBirth(int dayOfBirth) { this.dayOfBirth = dayOfBirth; }
    public void setMonthOfBirth(int monthOfBirth) { this.monthOfBirth = monthOfBirth; }
    public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }

    public String getFirstName() { return firstName; }
    public String getLastName() { return  lastName; }
    public int getDayOfBirth() { return dayOfBirth; }
    public int getMonthOfBirth() { return monthOfBirth; }
    public int getYearOfBirth() { return yearOfBirth; }

    public int getPersonsAge(HeartRates personAccount) {
        return 2021 - (personAccount.getYearOfBirth());
    }

    public void getPersonsInfoAndMaxHeartRate(HeartRates currentPerson) {
        System.out.println(currentPerson.getFirstName() + " " + currentPerson.getLastName());
        System.out.println(currentPerson.getDayOfBirth() + "/" + currentPerson.getMonthOfBirth() + "/" + currentPerson.yearOfBirth);
        System.out.printf("Maximum heart rate in beats per minute is %d", 220 - currentPerson.getPersonsAge(currentPerson));
    }
}
