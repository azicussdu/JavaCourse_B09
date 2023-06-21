package week6.day1;

public class Homework {

    public static double findMin(double a, double b, double c, double d){
        double min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        if(d < min)
            min = d;

        return min;
    }

    public static boolean isNegative(int a){
        return a < 0;
    }

    public static void main(String[] args) {
//        boolean result = isNegative(-3);
//        System.out.println(result);

//        double minimum = findMin(3.2, 4.5, 1.2, 5.1);
//        System.out.println("minimum is: " + minimum);
    }
}
