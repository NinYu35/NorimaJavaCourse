package AssessmentGraded.course3.module2;

/**
 * Java Course 3, Module 2, Assignment 2:  Java Collection Framework (Graded)
 * Bank Account
 *
 * @author : Niño Galanida
 * Date Created : 06/15/2022
 */
public abstract class BankAccount {

    private double balance;

    //Force Subclasses to use their own print methods.
    public abstract void display();

    //constructor
    public BankAccount(double balanceSum) {
        this.balance = balanceSum;
        if(balance < 0) {
            balance = 0;
        }
    }

    //get instance balance
    public double getBalance(){
        return balance;
    }

    //Deposit instance sum
    public void deposit(double depositSum) {
        balance += depositSum;
    }

    //withdraw instance sum
    public void withdraw(double withdrawSum) {
        balance -= withdrawSum;
        if(balance < 0) {
            balance = 0;
        }
    }

}