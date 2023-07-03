package week6.day3;

import java.util.Random;

public class Homework {

    public static int getAmountOfDigits(String str){
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                count++;
            }
        }

        return count;
    }

    public static void printOddColumnValues(int arr[][]){
        System.out.println("------- printing values from only odd indexed columns now -------");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(j % 2 == 1)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        String s = "Wall st. 153, apartment 46";
//        System.out.println("amount of digits in string is: " + getAmountOfDigits(s));

//        Random random = new Random();
//        int[][] arr = new int[3][5];
//
//        System.out.println("------ filling array and showing all values first --------");
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[0].length; j++){
//                arr[i][j] = random.nextInt(1, 20);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        printOddColumnValues(arr);
    }
}
