package ActivityUngraded.course2.module3Arrays;

/**
 * Java Course 2, Module 3, Ungraded Practice Activity
 * Guess List
 *
 * @author : Niño Galanida
 * Date Created : 06/10/2022
 */
public class PartyDriver {
    public static void main(String[] args){

        Party party = new Party(3, "David Beckham");
        party.addGuest("Roberto Baggio");
        party.addGuest("Zinedine Zidane");
        party.addGuest("Roberto Baggio");
        party.addGuest("Johan Cruyff");
        party.addGuest("Diego Maradona");
        party.printParty();

    } // end main
}
