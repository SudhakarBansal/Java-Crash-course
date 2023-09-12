package org.example;
import java.util.Scanner;
public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int numberOfMatches = 0;
        System.out.println("Enter scores for matches (enter a negative number to terminate):");
        while (numberOfMatches < 5) {
            System.out.print("Enter score for match " + (numberOfMatches + 1) + ": ");
            int score = scanner.nextInt();

            if (score < 0) {
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
