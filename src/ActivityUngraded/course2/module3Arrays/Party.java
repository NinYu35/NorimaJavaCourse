package ActivityUngraded.course2.module3Arrays;

/**
 * Java Course 2, Module 3, Ungraded Practice Activity
 * Guess List
 *
 * @author : Niño Galanida
 *
 * Date Created : 06/10/2022
 */
public class Party {

    // instance variables
    private int intGuestCount = 0;
    private final String partyHost;
    private final int maxNumberOfGuests;
    private final String[] guestList;

    // Constructor that stores maximum number of guests and host's name
    public Party(int maxNumberOfGuests,String hostName){

        this.maxNumberOfGuests = maxNumberOfGuests;
        this.partyHost = hostName;
        guestList = new String[this.maxNumberOfGuests];
    }

    // Method that adds a guest to the guest list or prints an error message if guess is already on the list or there's no more room
    public void addGuest(String strGuestName) {

        if (intGuestCount <  maxNumberOfGuests) {

            if (isOnList(strGuestName)) {

                System.out.println(strGuestName + " is already on the guest list.");
            }
            else {
                //Add to array.
                this.guestList[intGuestCount]=strGuestName;
                this.intGuestCount++;
            }//End Nest if/else Statements
        }
        else {
            System.out.println(strGuestName + " cannot come to the party. The guest list is full.");
        }
    } //End addGuest Method

    // Method that receives a parameter named guest. The method returns true if guest is on the guest list and returns false otherwise.
    public boolean isOnList(String guest) {

        for (int i = 0; i < maxNumberOfGuests; i++) {

            if(this.guestList.length > 0){

                if (this.guestList[i] == guest) {

                    return true;
                }
            }
        }
        return false;
    }

    //Method that prints the party’s host and guests.
    public void printParty() {
        System.out.println("Guest list for " + this.partyHost + "'s party:");

        for (int i = 0; i < maxNumberOfGuests; i++) {

            System.out.println(guestList[i]);
        }
    }

}