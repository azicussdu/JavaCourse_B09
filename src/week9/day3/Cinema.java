package week9.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    private String name;
    private ArrayList<Movie> list = new ArrayList<>();

    public void addMovie(Movie movie){
        list.add(movie);
    }

    public void removeMovie(){
        for(int i=0; i<list.size(); i++){
            System.out.println((i+1) + ". " + list.get(i).getName());
        }
        System.out.print("choose number to remove: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        list.remove(num-1);
    }

    public void showAllMovies(){
        for(Movie m: list){
            System.out.println(m.getName());
        }
    }

    public void showMoviesByGenre(Genre genre){
        for(Movie m: list){
            if(m.getGenre() == genre) {
                System.out.println(m.getName());
            }
        }
    }

    public void showByYear(int yearFrom, int yearTill){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getYear() >= yearFrom && list.get(i).getYear() <= yearTill) {
                System.out.println(list.get(i).getName());
            }
        }
    }

    public Cinema(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
