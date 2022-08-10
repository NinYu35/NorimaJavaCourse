package AssessmentGraded.course2.module2;


/**
 * Java Course 2, Module 2, Assignment 2: Object-Oriented Programming Advanced
 *
 * Person
 *
 * @author : Niño Galanida
 * Date Created : 06/09/2022
 */
public class Person {

    //Initialize Instance Variables
    private String first;
    private String last;
    public static int numOfPeople;


    public Person() {
        this.first = "John";
        this.last ="Doe";
        numOfPeople++;
    }

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
        numOfPeople++;
    } //end constructor

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public static int getNumOfPeople() {
        return numOfPeople;
    }

    public void printFullName() {
        System.out.println(this.first + " " + this.last);
    }

} // End Class