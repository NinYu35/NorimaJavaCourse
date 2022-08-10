package AssessmentGraded.course2.module2;

/**
 * Java Course 2, Module 2, Assignment 2: Object-Oriented Programming Advanced
 * IP Address Conversion
 *
 * @author : Niño Galanida
 * Date Created : 06/09/2022
 */
public class IpAddressDriver {

    public static void main(String[] args) {

        //Create an Object & Initialize the Constructor.
        IpAddress ip= new IpAddress("216.27.6.136");

        System.out.println(ip.getDottedDecimal());
        System.out.println(ip.getOctet(4));
        System.out.println(ip.getOctet(1));
        System.out.println(ip.getOctet(3));
        System.out.println(ip.getOctet(2));

    }//End Main
}//End Driver Class