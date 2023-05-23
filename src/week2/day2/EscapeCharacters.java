package week2.day2;

public class EscapeCharacters {
    public static void main(String[] args){

        /*
        There are special symbols, we call them escape characters.
        \n - newline (puts the cursor down to the next line in console)
        \" - prints the symbol " in the console
        \\ - prints the symbol \ in the console
        \t - prints a tab (tab = 4 spaces)
         */

        //After each word you are making newline (run to see it)
        System.out.println("I\nlove\ncoding\n");

        //to print " symbol you should write \" in the code
        System.out.println("I love \"Java\" language");

        //to print \ symbol you should write \\ in the code
        System.out.println("\\I am between slashes\\");

        /*
        printing first line with no tab,
        second line with 1 tab,
        and third line with 2 tabs
         */
        System.out.print("No tab in this line\n\tone tab here\n\t\ttwo tabs here\n");
    }
}