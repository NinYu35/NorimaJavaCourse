package ActivityUngraded.course2.module2OOPAdvanced;

import java.util.Scanner;
/**
 * Java Course 2, Module 2, Ungraded Practice Activity
 * Automobile Description
 *
 * @author : Niño Galanida
 * Date Created : 06/09/2022
 */

public class AutomobileDriver {

    public static void main(String[] args) {

        //Initialize Variables
        Scanner scanInput = new Scanner (System.in);

        //Set Local Variable
        int numberOfCars = 0;

        //Create an Object of Automobile.
        Automobile auto = new Automobile();

        //Get # of Cars to Process
        try{
            System.out.print("How many cars do you want to consider? ");
            numberOfCars = scanInput.nextInt();
        }
        catch(Exception e) {
            System.out.println("Error: Enter an Integer for a number.");
            System.out.println("Please restart the application to resolve this issue.");
        }
        for(int i=0; i<numberOfCars;i++){

            //Run the methods
            auto.setMake();
            auto.setColor();
            auto.printColor();
            auto.printMake();

            scanInput.close();


        } //End For Loop
    }//End Main Class
}//End AutomobileDriver