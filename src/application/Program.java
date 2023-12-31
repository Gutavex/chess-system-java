package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		// Position pos = new Position(3, 5);
		// System.out.println(pos);

		// Board board = new Board(8, 8);

		Scanner sc = new Scanner(System.in);

		// INSTANCIAR UMA PARTIDA E IMPRIMIR TABULEIRO
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			} catch (ChessException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				sc.nextLine();
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}

	}

}
