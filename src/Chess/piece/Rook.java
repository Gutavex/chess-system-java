package chess.piece;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	

	//TO STRING DA CLASSE
	@Override
	public String toString() {
		return "R";  //Essa letra representará nosso objeto no tabuleiro
	}
	
	
	

}
