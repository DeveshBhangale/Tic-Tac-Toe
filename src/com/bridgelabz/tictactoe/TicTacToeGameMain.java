package com.bridgelabz.tictactoe;
import java.util.*;


public class TicTacToeGameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicTacToeGame t = new TicTacToeGame();
		char[] board = t.createBoard();
		System.out.println("Enter your Choice X or O");
		char input = sc.next().charAt(0);
		t.setInput(Character.toUpperCase(input));
		System.out.println(t.getPlayer());
	}

}
