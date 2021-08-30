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
		if(t.toss()) {
			int index = t.checkPosition();
			if(t.checkFreeSpace()) {
				t.makeMove(index);
				t.showBoard();
			}
			else
				System.out.println("No Index is free, hence tie");
			
		}
			
		
		sc.close();
	}

}
