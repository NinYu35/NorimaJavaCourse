package AssessmentGraded.course2.module2;

/**
 * Java Course 2, Module 2, Graded Practice Activity
 * IP Address Conversion
 *
 * @author : Niño Galanida
 * Date Created : 06/09/2022
 */
public class IpAddress {

    //Initialize Instance Variables
    String dottedDecimal;
    int firstOctet;
    int secondOctet;
    int thirdOctet;
    int fourthOctet;


    public IpAddress (String dottedDecimal){

        this.dottedDecimal = dottedDecimal;

        //Split into parts
        String [] octets = this.dottedDecimal.split("\\."); //Splits the ip address separated by dot "."
        int [] octet = new int[octets.length];

        for (int i=0; i < octets.length; i++) {

            octet[i] = Integer.parseInt(octets[i]);  //Convert String to Int

        }  // End For loop

        this.firstOctet = octet[0];
        this.secondOctet = octet[1];
        this.thirdOctet = octet[2];
        this.fourthOctet = octet[3];

    } //End Method IpAddress

    //Return Full IP string
    public String getDottedDecimal(){
        return this.dottedDecimal;
    }

    //Split into parts & return as int
    public int getOctet(int index){
        if (index == 1) {

            return this.firstOctet;
        }
        else if (index == 2) {

            return this.secondOctet;
        }
        else if (index == 3) {

            return this.thirdOctet;

        }
        else if (index == 4) {

            return this.fourthOctet;

        }
        else {
            System.out.println("There only four octet.");
            return -1;
        } //End Nest if/elseif /elseif / elseif/ else statements

    } //End Method getOctet

}//End Class