package AssessmentGraded.course1.module1;

import java.util.Scanner;
/**
 * Java Course 1, Module 1
 * One Hundredth Birthday
 *
 * @author : Niño Galanida
 * Date Created : 06/06/2022
 */

public class OneHundredthBirthday {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);                 // Scanner
        System.out.print("Enter the month you were born: ");
        String month = s.nextLine();                        // user input - month

        System.out.print("Enter the day you were born: ");
        int day = s.nextInt();                              // user input - day

        System.out.print("Enter the year you were born: ");
        int year = s.nextInt();                             // user input - year

        int hundredth = (year + 100);

        System.out.println("You will be 100 on " + month +" "+ day +"," +" " + hundredth +".");

        s.close();
    }
}