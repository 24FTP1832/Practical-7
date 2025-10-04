package Practical7;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int rounds = 0, userScore = 0, compScore = 0;
        String playAgain;

        do {
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int user = input.nextInt();
            int comp = rand.nextInt(3);

            String [] choices = {"rock", "paper", "scissor"};
            System.out.println("The computer is " + choices[comp] + ". You are " + choices[user] + ".");

            if (user == comp) {
                System.out.println("It is a draw.");

            }
            else if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1)) {
                System.out.println("You win.");
                userScore++;

            }
            else {
                System.out.println("You lose.");
                compScore++;

            }

            rounds++;
            System.out.print("Enter y to play again: ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("\nIn the total of " + rounds + " round(s), You scored " + userScore + ", Computer scored " + compScore);
        if (userScore > compScore) {
            System.out.println("You won the game.");

        }
        else if (userScore < compScore) {
            System.out.println("You lose the game.");

        }
        else {
            System.out.println("It is a draw game.");
            
        }
    }
}
