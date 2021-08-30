package com.bridgelabz.tictactoe;
import java.util.Scanner;


public class TicTacToeGameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicTacToeGame t = new TicTacToeGame();
		t.createBoard();
		System.out.println("Enter your Choice X or O");
		char input = Character.toUpperCase(sc.next().charAt(0));
		t.setInput(input);
		System.out.println("Player: "+ t.player + "\nComputer: "+t.computer);
		t.showBoard();	
		t.toss(); // tossing
		while(true) {
			if(t.checkFreeSpace()) {
				if(t.turn == 0) {
					System.out.println("your turn");
					int index = t.checkPosition();
						t.makeMove(index);
						t.showBoard();
						if(t.checkWin()) {
							System.out.println("Congrats, You've Won"); break;
						}
					}
				else {
					t.computerMove();
					t.showBoard();
					if(t.checkWin()) {
						System.out.println("Better Luck Next Time"); break;
					}
				}
			}
			else {
				System.out.println("Tie"); break;
			}
		}
			
		
	}

}
