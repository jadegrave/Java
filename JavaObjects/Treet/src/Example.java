//package com.teamtreehouse;  // don't include this - if you do, it makes Example part of the com.teamtreehouse package

import java.util.Arrays;
import java.util.Date;

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;

public class  Example {
    public static void main (String [] args) {

//  This is for manually creating tweets
//        Treet treet = new Treet(
//                "craigsdennis",
//                 "Want to be famous? Simply tweet about Java and use " +
//                  "the hashtag #treet. I'll use your tweet in a new " +
//                  "@treehouse course about data structures",
//                  new Date(1421849732000L) // the time in milliseconds from Unix epoch - use the link in Google favs
//        );
//
//        Treet secondTreet = new Treet("journeytocode",
//                                       "@treehouse makes learning Java soooooo fun! #treet",
//                                        new Date(1421878767000L));
//        System.out.printf("This is a new Treet:  %s%n", treet);
//        System.out.println("The words are: ");
//        for (String word: treet.getWords()) {
//            System.out.println(word);
//        }
//
//        Treet[] treets = {secondTreet, treet};
//        Arrays.sort(treets);
//        for (Treet exampleTreet : treets) {
//            System.out.println(exampleTreet);
//        }
//
//        Treets.save(treets);
//
//        Treet [] reloadedTreets = Treets.load();
//        for (Treet reloaded : reloadedTreets) {
//            System.out.println(reloaded);
//        }

        Treet[] treets = Treets.load();
        System.out.printf("There are %d treets. %n", treets.length);
        Treet originalTreet = treets[0];
        System.out.println("Hashtags: ");
        for (String hashtag : originalTreet.getHashTags()){
            System.out.println(hashtag);
        }
    }
}
