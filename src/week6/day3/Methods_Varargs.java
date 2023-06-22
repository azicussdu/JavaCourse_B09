package week6.day3;

public class Methods_Varargs {

    public static int findSum(int... nums){ //varargs
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void greeting(String... names){
        for(int i=0; i<names.length; i++){
            System.out.println("Hello " + names[i]);
        }
    }

    public static void main(String[] args) {
//        greeting("Alexander", "Anna", "Muhlis", "Mert");

//        int result = findSum(1, 2, 3, 6);
//        System.out.println("result: " + result);



    }
}
