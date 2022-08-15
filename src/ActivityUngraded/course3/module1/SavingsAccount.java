package ActivityUngraded.course3.module1;

/**
 * Java Course 3, Module 1, Ungraded Practice Activity
 * Savings Account
 *
 * @author : Niño Galanida
 * Date Created : 06/14/2022
 */
public class SavingsAccount {

    private static double annualInterestRate;    // class variable
    private final int ACCOUNT_NUMBER;            // instance constant
    private double balance;                      // instance variable, initial balance

    public SavingsAccount(int ACCOUNT_NUMBER, double balance) {

        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.balance = balance;
    }  // end constructor

    public int getACCOUNT_NUMBER() {
        return this.ACCOUNT_NUMBER;
    } // end getACCOUNT_NUMBER

    public double getBalance() {
        return this.balance;
    } // getBalance

    public double addMonthlyInterest() {
        return this.balance += ((balance * annualInterestRate )/ 12);
    } // end addMonthlyInterest

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    } // end of class method setAnnualInterestRate

} // end class SavingsAccount