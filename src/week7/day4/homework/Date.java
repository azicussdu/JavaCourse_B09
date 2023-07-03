package week7.day4.homework;

public class Date {
    int year;
    int month;
    int day;

    public Date(int year){
        this.year = year;
        month = 1;
        day = 1;
    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate(){
        System.out.println((day < 10 ? "0"+day : day) + "/" + (month < 10 ? "0"+month : month) + "/" + year);
    }

    public String getSeason(){
        String season = "";
        switch (month){
            case 1,2,12 -> season = "winter";
            case 3,4,5 -> season = "spring";
            case 6,7,8 -> season = "summer";
            case 9,10,11 -> season = "fall";
        }
        return season;
    }
}
