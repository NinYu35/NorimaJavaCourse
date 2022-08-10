package AssessmentGraded.course1.module2;


import java.util.Scanner;
/**
 * Java Course 1, Module 2
 * Economic Policy
 *
 * @author : Niño Galanida
 * Date Created : 06/06/2022
 */
public class EconomicPolicy {

    public static void main(String[] args) {

        //Used to get user input from the console.
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the annual growth rate: ");

        String growthRate = scan.next();

        System.out.print("Enter annual inflation rate: ");

        String inflationValues = scan.next();

        //Remove %s from Strings
        growthRate = growthRate.replace("%", "");
        inflationValues = inflationValues.replace("%", "");

        //Convert to a Double.
        double calcGrowthRate = Double.parseDouble(growthRate);
        double calcInflationValues = Double.parseDouble(inflationValues);

        if (calcGrowthRate < 1)
        {
            if(calcInflationValues < 3)
            {
                System.out.println("Recommended Economic Policy:");
                System.out.print("Increase welfare spending, reduce personal taxes, and decrease discount rate.");
            }else{
                System.out.println("Recommended Economic Policy:");
                System.out.print("Reduce business taxes.");
            }//End Nest if/else Statements  #1
        }

        else if (calcGrowthRate > 4)
        {
            if (calcInflationValues < 1){
                System.out.println("Recommended Economic Policy:");
                System.out.println("Increase personal and business taxes, and decrease discount rate.");
            }else if (calcInflationValues > 3){
                System.out.println("Recommended Economic Policy:");
                System.out.print("Increase discount rate.");
            }else{
                System.out.println("No change in economic policy.");
            }//End Nest if/elseif /else statements #2
        }

        else {
            System.out.println("No change in economic policy.");
        }//End Outer if/elseif/else Statements

        scan.close();

    }//End Method

}//End Class