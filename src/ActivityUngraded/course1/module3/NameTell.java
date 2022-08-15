package ActivityUngraded.course1.module3;

import java.util.Scanner;

/**
 * Java Course 1, Activity 3 (Non Graded)
 * Name Tell
 *
 * @author : Niño Galanida
 * Date Created : 06/07/2022
 */
public class NameTell {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();  // input name

        char firstChar = name.charAt(0);  // Get the first character of name
        int stringLength = name.length();   // Calculate the length of the string


        System.out.println("\nYour name has " + stringLength + " including spaces.");

        System.out.println("\nThe first letter is: " + firstChar);

    } // end main
}
