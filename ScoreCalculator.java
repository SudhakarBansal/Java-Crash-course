
//Q -     Build Score Application
//        1. The application should be a console application (No need to use JavaFX)
//        2. It accepts scores for matches per match (max 5 matches) from the console.
//        3. The application terminates if the score value is less than 0
//        4. After terminations print:
//        - Total Score,
//        - Number of Matches,
//        - Average score per match


package org.example;

import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int numberOfMatches = 0;
        System.out.println("Enter scores for matches (enter a negative number to terminate):");
        while (numberOfMatches < 5) {                               //To run the loop Max 5 times
            System.out.print("Enter score for match " + (numberOfMatches + 1) + ": ");
            int score = scanner.nextInt();

            if (score < 0) {                                        //terminate Loop if Some negative score is provided
                break;
            }

            totalScore += score;
            numberOfMatches++;
        }

        if (numberOfMatches > 0) {
            float averageScore = (float) totalScore / numberOfMatches;
            System.out.println("Total Score: " + totalScore);
            System.out.println("Number of Matches: " + numberOfMatches);
            System.out.println("Average Score per Match: " + averageScore);
        } else {
            System.out.println("No matches entered.");
        }
    }
}


/*
Output:
        Enter scores for matches (enter a negative number to terminate):
        Enter score for match 1: 5
        Enter score for match 2: 3
        Enter score for match 3: 6
        Enter score for match 4: -1
        Total Score: 14
        Number of Matches: 3
        Average Score per Match: 4.6666665
*/
