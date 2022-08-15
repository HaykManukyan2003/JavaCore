package folders.date;
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {

        if (day > 0 && day <= 31) this.day = day;
        else this.day = 1;

        if (month > 0 && month <= 12) this.month = month;
        else this.month = 1;

        if (year >= 1885 && year < 2023) this.year = year;
        else this.year = 1885;

    }

    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public void getDate() {
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }
}
