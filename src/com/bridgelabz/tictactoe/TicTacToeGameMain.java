package com.bridgelabz.tictactoe;
import java.util.Scanner;


public class TicTacToeGameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicTacToeGame t = new TicTacToeGame();
		char[] board = t.createBoard();
		System.out.println("Enter your Choice X or O");
		char input = Character.toUpperCase(sc.next().charAt(0));
		t.setInput(input);
		System.out.println(t.getComputer());
		t.showBoard();
		sc.close();
	}

}
