package week6.day2;

public class Methods_3 {

    public static void print2dArray(int[][] myarr){
        for(int i=0; i< myarr.length; i++){
            for(int j=0; j<myarr[0].length; j++){
                System.out.print(myarr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMaxFrom2dArray(int[][] myarr){
        int max = myarr[0][0];
        for(int i=0; i< myarr.length; i++){
            for(int j=0; j<myarr[0].length; j++){
                if(myarr[i][j] > max)
                    max = myarr[i][j];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,2,1},
                {3,4,7,3},
                {5,6,6,5}
        };
        print2dArray(arr);

        int max = findMaxFrom2dArray(arr);
        System.out.println("max is: " + max);


    }
}
