package AssessmentGraded.course1.module3;

import java.util.Scanner;

/**
 * Java Course 1, Module 3 (Graded)
 * Phone Number Dissector
 *
 * @author : Niño Galanida
 * Date Created : 06/07/2022
 */
public class PhoneNumberDissector {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner stringInput = new Scanner(System.in);

        String telephone ;

        do {
            System.out.println("Enter a phone number in the form cc-area-local,"
                    + " where cc = country code digits, area = area code digits, "
                    + " and local = local phone digits.");
            System.out.print("Or enter q to quit:");
            telephone = stringInput.nextLine();   // user input

            if (!telephone.equalsIgnoreCase("q")) {
                int countryCode = telephone.indexOf('-');  //scans the first index '-'
                int areaCode = telephone.indexOf('-',countryCode+1 );  // scans the second index '-'
                int localPhone = telephone.length();   // gets the length of the local phone number

                System.out.println("country code = " + telephone.substring(0,countryCode));  // prints the country code
                System.out.println("area code = " + telephone.substring(countryCode+1, areaCode));  //prints the area code
                System.out.println("local phone number = " + telephone.substring(areaCode+1,localPhone)); //prints the local phone number
                System.out.println(" ");
            } //end of if statement

        } while (!telephone.equalsIgnoreCase("q"));{
            System.out.println("Bye");
            stringInput.close();   // closes the program
        }
    }//end of main
}



