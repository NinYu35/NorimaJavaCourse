package AssessmentGraded.course3.module2;

/*
 * Java Course 3, Module 2, Assignment 2:  Java Collection Framework (Graded)
 * Bank Account
 *
 * @author : Niño Galanida
 * Date Created : 06/15/2022
 */
import java.text.NumberFormat;  //Used to format dollar amount
import java.util.Locale;  // added Locale.US to get the dollar sign($) or else a question mark (?) appears instead

//Subclass that extends BankAccount.
public class Checking extends BankAccount {

    //Constructor
    public Checking(double balanceSum) {
        super(balanceSum);
    }

    //Withdraw Sum plus $1 fee.
    public void writeACheck(double checkSum) {
        super.withdraw(checkSum + 1);
    }

    //Display balance in Dollar format.
    public void display() {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Checking account balance  = " + defaultFormat.format(super.getBalance()));
    }

}