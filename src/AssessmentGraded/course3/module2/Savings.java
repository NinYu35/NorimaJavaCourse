package AssessmentGraded.course3.module2;

/*
 * Java Course 3, Module 2, Assignment 2:  Java Collection Framework (Graded)
 * Bank Account
 *
 * @author : Niño Galanida
 * Date Created : 06/15/2022
 */
import java.text.NumberFormat; //Used to format dollar amount.
import java.util.Locale; // added Locale.US to get the dollar sign($) or else a question mark (?) appears instead

//Subclass that extends BankAccount.
public class Savings extends BankAccount {

    private final double intRate;

    // constructor
    public Savings(double balanceSum, double interest) {
        super(balanceSum);
        intRate = interest;
    }

    //Call parent class deposit.
    public void deposit(double depositSum) {
        super.deposit(depositSum);
    }

    //Call parent class withdraw,
    public void withdraw(double withdrawSum) {
        super.withdraw(withdrawSum);
    }

    //Deposit calculated interest sum.
    public void addInterest() {
        super.deposit(intRate * super.getBalance());
    }

    //Display balance in Dollar format.
    public void display() {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Savings account balance   = " + defaultFormat.format(super.getBalance()));
    }
}