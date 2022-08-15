package ActivityUngraded.course3.module1;

/**
 * Java Course 3, Module 1, Ungraded Practice Activity
 * Savings Account
 *
 * @author : Niño Galanida
 * Date Created : 06/14/2022
 *
 */
public class SavingsAccountDriver {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(10002, 2000);
        SavingsAccount saver2 = new SavingsAccount(10003, 3000);
        double annualInterestRate = 0.05;
        double totalBalance = 0;            //Final balance of both accounts combined

        SavingsAccount.setAnnualInterestRate(annualInterestRate);
        System.out.print("Monthly balances for one year with 0.05 annual interest:\n\n");
        System.out.printf("%5s%10s%10s%10s%10s\n", "Month","Account #", "Balance", "Account #", "Balance");
        System.out.printf("%5s%10s%10s%10s%10s\n", "-----", "---------","-------","---------","-------");

        for (int i=0; i<=12; i++)
        {

            if (i == 0)
                System.out.printf("%5d%10d%10.2f%10d%10.2f\n", i, saver1.getACCOUNT_NUMBER(),saver1.getBalance(),
                        saver2.getACCOUNT_NUMBER(), saver2.getBalance());
            else
                System.out.printf("%5d%10d%10.2f%10d%10.2f\n", i, saver1.getACCOUNT_NUMBER(),saver1.addMonthlyInterest(),
                        saver2.getACCOUNT_NUMBER(), saver2.addMonthlyInterest());
        } //end For loop
        totalBalance = saver1.getBalance() + saver2.getBalance();

        System.out.printf("\n\n Final balance of both accounts combined: %.2f",totalBalance);
    } // end main

} // end SavingsAccountDriver
