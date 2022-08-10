package AssessmentGraded.course1.module2;

import java.util.Scanner;

/**
 * Java Course 1, Module 2
 * BankBalance
 *
 * @author : Niño Galanida
 * Date Created : 06/06/2022
 */

public class BankBalance {

    public static void main(String[] args) {

        // Initialize values for years
        int yearsInHundredThousand = 0;
        int yearsInMillion = 0;

        //Initialize the scanner class.
        //Used to get user input from the console.
        Scanner s = new Scanner(System.in);

        System.out.print("Enter starting balance: ");
        int startingBalance = s.nextInt();

        // Check if starting balance  reaches 1000000 while it doubles every year until it reaches its goal
        for ( int i = startingBalance; i<=1000000; i *=2) {
            if (i <= 100000) {  // Check if starting balance reaches 10000
                yearsInHundredThousand++; //Add one year to count until it reaches 10000
            } //End if Statement
            yearsInMillion++;  //Add one year to count  until it reaches 1000000
        } //End for loop

        System.out.println("It takes " + yearsInHundredThousand + " years to reach $100,000.");
        System.out.println("It takes " + yearsInMillion + " years to reach $1,000,000.");

        s.close();
    } //End Main

}//End Class
