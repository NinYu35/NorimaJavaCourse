package ActivityUngraded.course1.module2;

import java.util.Scanner;

public class PeachBoxCounter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of peaches picked: ");

        int numPeaches = s.nextInt();
        for (int i = 0; i <= numPeaches; i+=20) {

            System.out.println("shipped "+ i +" peaches so far");
        }
    }
}
