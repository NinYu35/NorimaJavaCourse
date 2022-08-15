package ActivityUngraded.course3.module2;

import java.util.ArrayList;

/**
 * Java Course 3, Module 2, Ungraded Practice Activity
 * Address List
 *
 * @author : Niño Galanida
 * Date Created : 06/15/2022
 *
 */
public class AddressList {

    public static void main(String[] args) {
        ArrayList<String> addressList = new ArrayList<>();

        addressList.add("1600 Pennsylvania Avenue");
        addressList.add("221B Baker Street");
        addressList.add("221B Baker Street");
        addressList.add("8700 N.W. River Park Drive");

        for (String x : addressList) {
            System.out.println(x);
        }

    }
}