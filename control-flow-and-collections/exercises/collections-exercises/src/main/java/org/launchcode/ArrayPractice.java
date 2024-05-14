package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] arg) {

        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = drSeuss.split(" ");
        String[] seussArr = drSeuss.split("\\. ");
        System.out.println(Arrays.toString(seussArr));
        System.out.println(seussArr[3]);

        //        int[] intArray = {1, 1, 2, 3, 5, 8};    - Part 1 & 2 Array

        /* Part 2 before modification to only print odd numbers.

        for (int i : intArray) {
            System.out.println(i);
        }

        */

        /* Part 2 only print odd numbers code

        for (int i : intArray) {
            if ((i % 2) == 1 ) {
                System.out.println(i);
            }
        }

         */
    }
}
