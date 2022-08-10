package AssessmentGraded.course1.module1;

import java.util.Scanner;
import java.lang.Math;

/**
 * Java Course 1, Module 1
 * Circle Parameters
 *
 * @author : Niño Galanida
 * Date Created : 06/06/2022
 */

public class CircleParameters {

    public static void main(String[] args) {

        double radius, diameter,circumference, area;

        Scanner s = new Scanner(System.in);           // Scanner
        System.out.print("Enter a radius value: ");

        radius = s.nextDouble();                      // user input - radius
        diameter = (radius * 2);
        circumference = ( Math.PI * diameter );
        area = (Math.PI * radius * radius );

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.print("Area = " + area);

        s.close();

    }
}