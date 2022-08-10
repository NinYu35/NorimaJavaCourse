package AssessmentGraded.course2.module1;

/**
 * Java Course 2, Module 1
 * Hands-on Assignment 1: Object-oriented Programming
 * TownDriver.java
 *
 * @author : Niño Galanida
 * Date Created : 06/08/2022
 */
public class TownDriver {

    public static void main(String[] args) {

        //Create an Object of Town.
        Town newHome = new Town();


        //Run the methods
        newHome.initialize();
        newHome.simulateBirth(); //2x : birth of the twins
        newHome.simulateBirth();
        newHome.printStatistics();

        System.out.println();

    } //end of main

} //end of class TownDriver
