package ActivityUngraded.course2.module4ExceptionHandling;

import java.util.Scanner;
/**
 * Java Course 2, Module 2, Ungraded Practice Activity
 * Automobile Description
 *
 * @author : Niño Galanida
 * Date Created : 06/09/2022
 */

public class Automobile {

    //Initialize Variables
    Scanner scanClass = new Scanner (System.in);
    String make = "";	//Make of car.
    String color = ""; 	//Color of car


    public void setMake() {

        String selectedCar;
        System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
        selectedCar = scanClass.nextLine();

        //End Set Make
        if( !selectedCar.trim().equals("b") && !selectedCar.trim().equals("c") && !selectedCar.trim().equals("p")) {
            System.out.println("The only valid selections are 'b','c','p'");
            System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
            selectedCar = scanClass.nextLine();
        }
        switch (selectedCar.trim()) {
            case "b" -> this.make = "Buick";
            case "c" -> this.make = "Chevrolet";
            case "p" -> this.make = "Pontiac";
        }
    }//End Method
    public void setColor() {
        String selectedColor;
        System.out.print("Select blue, green, or red (b,g,r): ");
        selectedColor = scanClass.nextLine();

        switch (selectedColor.trim()) {
            case "b" -> this.color = "blue";
            case "g" -> this.color = "green";
            case "r" -> this.color = "red";
            default -> this.color = "undefined color";
        }

    } //End Set color

    public void printColor() {
        System.out.print(this.color + " ");
    }

    public void printMake() {
        System.out.println(this.make);
    }

} //End Automobil