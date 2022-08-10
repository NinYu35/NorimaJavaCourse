package AssessmentGraded.course2.module2;

/**
 * Java Course 2, Module 2, Assignment 2: Object-Oriented Programming Advanced
 * Person
 *
 * @author : Niño Galanida
 * Date Created : 06/09/2022
 */
public class PersonDriver {

    public static void main(String[] args) {

        //Create an Object & Initialize the Constructor.
        Person person1 = new Person();
        person1.printFullName();
        Person person2 = new Person("Matt", "Thebo");
        person2.printFullName();
        person1.setFirst("Paul");
        person1.setLast("John");
        person1.printFullName();
        System.out.println("Total number of people = " +
                Person.getNumOfPeople());
    } //End Main
} //End Person Driver
