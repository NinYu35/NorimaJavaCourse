package ActivityUngraded.course1.module1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class StockChangeCalculator {

    public static void main(String[] args) {

        float user_input2,user_input3, percentChange;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the stock symbol:");
        String user_input1 = s.nextLine();


        System.out.print("Enter " + user_input1 +"'s"+ " day 1 value:");
        user_input2 = s.nextFloat();


        System.out.print("Enter " + user_input1 +"'s"+ " day 2 value:");
        user_input3 = s.nextFloat();

        percentChange = (user_input3 - user_input2);

        DecimalFormat average = new DecimalFormat("0.00");

        System.out.print(user_input1 + " has changed " + average.format(percentChange) + "% in one day");
    }
}
