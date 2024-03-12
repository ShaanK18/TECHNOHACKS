package com.technohacks;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
        	System.out.println();
            System.out.println("Let's play Rock, Paper, Scissors!");
            System.out.println();
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String userChoice = scanner.nextLine().toLowerCase();
            
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }
            
            int computerInt = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors
            String computerChoice = "";
            switch (computerInt) {
                case 0:
                    computerChoice = "rock";
                    break;
                case 1:
                    computerChoice = "paper";
                    break;
                case 2:
                    computerChoice = "scissors";
                    break;
            }
            
            System.out.println("Computer chooses: " + computerChoice);
            
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock")) {
                if (computerChoice.equals("scissors")) {
                    System.out.println("!!You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else if (userChoice.equals("paper")) {
                if (computerChoice.equals("rock")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else if (userChoice.equals("scissors")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            }
            
            System.out.println();
            System.out.println("Do you want to play again? (yes/no):");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
