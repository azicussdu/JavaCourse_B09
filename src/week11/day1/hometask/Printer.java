package week11.day1.hometask;

import java.util.ArrayList;

public class Printer {

    public void printUppercased(String[] pages){
        for(String page : pages){ //"Page 1 content", null, "Page 3 content", "Page 4 content"
            try{
                System.out.println(page.toUpperCase());
                //throw new NullPointerException(); - java does this behind the scenes
            }
            catch(NullPointerException ex){
                System.out.println("This page has no content");
            }
        }
    }

    public void printInRange(String[] pages, int from, int to){
        for(int i=from-1; i<=to-1; i++){
            try{
                System.out.println(pages[i]);
                //throw new ArrayIndexOutOfBoundException();
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("There is no page with this page-number");
            }
        }
    }

    public void printInRange2(String[] pages, int from, int to){
        if(from > pages.length || from < 1 || to > pages.length || to < 1){
            throw new PageNumberDontExistException("Page numbers are out of size of document");
        }
        for(int i=from-1; i<=to-1; i++){
            System.out.println(pages[i]);
        }
    }
}
