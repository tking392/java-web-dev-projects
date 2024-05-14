package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] arg) {
        String alice = "Alice was beginning to get very tired " +
                "of sitting by her sister on the band, " +
                "and of having nothing to do: " +
                "once or twice she had peeped into the " +
                "book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to search for in the text: ");
        String wordSearch = input.nextLine();
        int index = alice.toLowerCase().indexOf(wordSearch.toLowerCase());
        int length = wordSearch.length();

        if (alice.toLowerCase().contains(wordSearch.toLowerCase())) {
            System.out.println("Good news! The word you are looking for is in the text!");
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modAlice = alice.toLowerCase().replace(wordSearch, "");
            System.out.println(modAlice);
        } else {
            System.out.println("I'm sorry, the word you are looking for is not in the text. =[");
        }
    }
}
