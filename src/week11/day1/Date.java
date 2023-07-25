package week11.day1;

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31)
            throw new InvalidDateException("Invalid day value");
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12)
            throw new InvalidDateException("Invalid month value");
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1)
            throw new InvalidDateException("Invalid year value");
        this.year = year;
    }
}
