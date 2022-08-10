package AssessmentGraded.course1.module3;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Java Course 1, Module 3 (Graded)
 * Variable Name Checker
 *
 * @author : Niño Galanida
 * Date Created : 06/07/2022
 */
public class VariableNameChecker {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner stringInput = new Scanner(System.in);

        String s = null; // user input

        do {
            System.out.print("Enter a variable name or (q to quit):");
            s = stringInput.nextLine();
            s = s.trim();
            char firstLetter = s.charAt(0);    // Get the first character of the string

            Pattern alphabetRegex = Pattern.compile(".*[A-Z].*", Pattern.CASE_INSENSITIVE);
            String numberRegex = ".*[0-9].*";
            boolean isValidAlpha = alphabetRegex.matcher(s).find();

            if (!s.equalsIgnoreCase("q")) {
                if (Character.isDigit(firstLetter) || s.contains(" ")) {
                    System.out.println("Illegal.");
                } else if (Character.isUpperCase(firstLetter) || s.contains("$")) {
                    System.out.println("Legal, but uses poor style.");
                } else if (isValidAlpha && s.matches(numberRegex)) {
                    System.out.println("Good!");
                } else {
                    System.out.println("Legal, but uses poor style");
                }
            } // end of if statement
        } while (!s.equals("q"));

        if (s.equals("q")) {   // if user input is 'q' closes the program
            System.out.println("Bye");
        }

        stringInput.close();

    }  //end of main
}
