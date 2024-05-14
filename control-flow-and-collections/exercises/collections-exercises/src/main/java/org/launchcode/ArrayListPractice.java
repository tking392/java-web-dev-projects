package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] arg) {

        ArrayList<Integer> numArr = new ArrayList<>();
            numArr.add(6);
            numArr.add(9);
            numArr.add(27);
            numArr.add(42);
            numArr.add(99);
            numArr.add(151);
            numArr.add(360);
            numArr.add(392);
            numArr.add(420);
            numArr.add(710);

            System.out.println(sumEven(numArr));
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
        }

}
