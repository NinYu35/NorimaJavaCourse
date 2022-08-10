package AssessmentGraded.course2.module3;

import java.util.Scanner;

/**
 * Java Course 2, Module 3, Assignment 3: Arrays
 * Vowel Counter
 *
 * @author : Niño Galanida
 * Date Created : 06/12/2022
 */
public class VowelCounterDriver {

    public static void main(String[] args) {

        //Initialize Variables
        Scanner scan = new Scanner (System.in);
        VowelCounter vc = new VowelCounter();
        String returnString = "default";

        while(!returnString.equals("")){

            System.out.println("Enter a line of characters (press enter by itself to quit)");
            returnString = scan.nextLine();

            if (returnString.length() > 0) {

                vc.processLine(returnString);//Process in the indicated method.
            }
        }//End While Loop

        vc.printSummary();//Print Summarized Report
        scan.close();

    }//End main method
}//End Class VowelCounterDriver