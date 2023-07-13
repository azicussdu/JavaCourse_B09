package week9.day3;

public class Movie {
    private String name;
    private int year;
    private Genre genre;

    public Movie(String name, int year, Genre genre){
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString(){
        return "name: " + name + " | genre: " + genre + " | year: " + year;
    }
}

enum Genre {
    ROMANTIC,
    HORROR,
    THRILLER,
    DRAMA,
    COMEDY,
    ACTION
}