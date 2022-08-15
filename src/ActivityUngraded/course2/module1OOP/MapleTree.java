package ActivityUngraded.course2.module1OOP;

import java.util.Scanner;

/**
 * Java Course 2, Module 1, Ungraded Practice Activity
 * Plant Germination
 *
 * @author : Niño Galanida
 * Date Created : 06/08/2022
 */
public class MapleTree {

    //Initialize Variables
    Scanner scanInput = new Scanner (System.in);
    private String plantDate = "";		//"dd/mm/yyy" date tree was planted
    private String heightDate = ""; 	//dd/mm/yyyy date the tree appeared to have grown.
    private float height = 0;			// % of a meter daily growth  rate



    public void plant() {
        System.out.print("Enter plant date (dd/mm/yyyy): ");
        plantDate = scanInput.nextLine();
        plantDate = plantDate.trim();

    }//End plant

    public void germinate() {
        System.out.print("Enter germination date (dd/mm/yyyy): ");
        heightDate = scanInput.nextLine();
        heightDate = heightDate.trim();

        //Tests for a proper double.
        try{
            System.out.print("Enter observed height in meters: ");
            height = scanInput.nextFloat();
        }
        catch(Exception e) {
            System.out.println("Error: Enter height in meters, as a percentage in decimal form.");
            System.out.println("Please restart the application to resolve this issue.");
        }
    }//End germinate

    public void dumpData() {
        System.out.println("Plant date = " + this.plantDate);
        System.out.println("Germinate date = " + this.heightDate);
        System.out.println("Initial height = " + this.height + " meters");

    }//End dumpData
}//End MapleTree Class
