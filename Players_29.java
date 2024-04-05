package com.web.java;

import java.util.Scanner;

public class Players_29 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean playAgain = true;

	        while (playAgain) {
	           
	            System.out.print("Player 1, enter your choice (rock, paper, or scissors): ");
	            String player1 = scanner.next().toLowerCase();

	           
	            System.out.print("Player 2, enter your choice (rock, paper, or scissors): ");
	            String player2 = scanner.next().toLowerCase();

	           
	            if (!(player1.equals("rock") || player1.equals("paper") || player1.equals("scissors")) ||
	                !(player2.equals("rock") || player2.equals("paper") || player2.equals("scissors"))) {
	                System.out.println("Invalid input. Please enter either rock, paper, or scissors.");
	                continue;
	            }

	           
	            String winner = "";
	            if (player1.equals(player2)) {
	                System.out.println("It's a tie!");
	            } else if ((player1.equals("rock") && player2.equals("scissors")) ||
	                       (player1.equals("paper") && player2.equals("rock")) ||
	                       (player1.equals("scissors") && player2.equals("paper"))) {
	                winner = "Player 1";
	            } else {
	                winner = "Player 2";
	            }

	           
	            if (!winner.equals("")) {
	                System.out.println(winner + " wins!");
	            }

	            
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainInput = scanner.next().toLowerCase();
	            if (!playAgainInput.equals("yes")) {
	                playAgain = false;
	            }
	        }

	        scanner.close();
	    }
	}


