package week11.day1;

public class Exceptions_3 {
    public static void main(String[] args) {

//        String str = "Hello";
//        System.out.println(str.charAt(10)); //will cause StringIndexOutOfBoundsException

//        int[] arr = {10, 20, 30, 40};
//        System.out.println(arr[7]); //will cause ArrayIndexOutOfBoundsException

//        showUppercase(null);
    }

    public static void showUppercase(String str){
        try {
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException ex){
            System.out.println("Can not call toUpperCase on null value");
        }
    }
}
