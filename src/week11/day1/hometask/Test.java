package week11.day1.hometask;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Kamarya");
        list.add("Lotfi");

        try{
            list.get(5);
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Sorry, only few string values here");
        }



//        Printer printer = new Printer();
//
//        String[] pages = {"Page 1 content", "Page 2 content",
//                          "Page 3 content", "Page 4 content",
//                          "Page 5 content", "Page 6 content"};
//
//        try{
//            printer.printInRange2(pages, 2, 8);
//        }
//        catch (PageNumberDontExistException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        printer.printUppercased(pages);


    }
}
