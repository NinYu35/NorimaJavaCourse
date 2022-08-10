package AssessmentGraded.course3.module1;

/**
 * Java Course 3, Module 1, Assignment 1: Inheritance and Polymorphism
 * Payroll
 *
 * @author : Niño Galanida
 * Date Created : 06/15/2022
 */

public class Hourly extends Employee {

    // Instance variable
    private double hourlyPay;
    private int hoursWorked;


    // Modified load method for hourly employees.
    // Take is an additional info (hourly pay & hours worked)
    public void load(Employee employee) {
        employee.load();
        System.out.print("Hourly pay ==> ");
        this.hourlyPay = input.nextDouble();

        System.out.print("Hours worked this past week ==> ");
        this.hoursWorked = input.nextInt();

        input.nextLine();

    }


    // getEarning Method to get the earning total of the employees
    public double getEarnings() {
        if(this.hoursWorked > 40) {
            int overTimeHours = 40 - this.hoursWorked;
            this.setPaycheck((40 * hourlyPay) + ((overTimeHours * hourlyPay) * 1.5) + this.getBonus());

            return this.paycheckLimit(this.getPaycheck());
        }

        this.setPaycheck(hourlyPay * hoursWorked);
        return this.paycheckLimit(this.paycheck);
    }

}