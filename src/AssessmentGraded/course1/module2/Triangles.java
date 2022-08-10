package AssessmentGraded.course1.module2;

import java.util.Scanner;

/**
 * Java Course 1, Module 2
 * Triangles
 *
 * @author : Niño Galanida
 * Date Created : 06/06/2022
 */

public class Triangles {

    public static void main(String[] args) {

        //Initialize the scanner class.
        //Used to get user input from the console.
        Scanner s = new Scanner(System.in);

        //Prompt the use for an integer.
        System.out.print("Enter the size of the equal sides in an isosceles triangle: ");

        //assign Int value to a variable.
        int triangleSize = s.nextInt();

        //Establish triangle variable.
        StringBuilder triangleRowString = new StringBuilder();

        //Step through the rows of the triangle
        for (int i = 1; i <= triangleSize; i++) {

            //Append row value(s) to myString
            for (int j = 1; j <= i; j++) {

                triangleRowString.append("*");
            }

            //Append new line separator @the end of a row
            triangleRowString.append("\n");

        }
        //print full string
        System.out.println(triangleRowString);

        s.close();
    }//End Main

} // End Class
