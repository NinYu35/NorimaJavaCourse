package AssessmentGraded.course2.module1;

import java.util.Scanner;

/**
 * Java Course 2, Module 1
 * Hands-on Assignment 1: Object-oriented Programming
 * Town.java
 *
 * @author : Niño Galanida
 * Date Created : 06/08/2022
 */
public class Town {

    //Initialize Variables
    private int numberOfAdults;
    private int numberOfChildren;


    //This method establishes initial values of instance variables.
    public void initialize(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of Adults: ");

        this.numberOfAdults = userInput.nextInt();

        System.out.print("Enter number of Children: ");
        this.numberOfChildren = userInput.nextInt();

        userInput.close();

    }//end initialize


    //This method simulates the birth of one child.
    public void simulateBirth(){

        this.numberOfChildren++;

    } //end simulateBirth


    // This method prints out the current vital statistics.
    public void printStatistics() {

        System.out.println("Total Number of adults : " + this.numberOfAdults);
        System.out.println("Total Number of children : " + this.numberOfChildren);

    } //end printStatictics

}//end class Town


