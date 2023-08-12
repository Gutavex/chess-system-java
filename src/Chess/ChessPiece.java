package Chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board); // passa a chamada para o construtor da super classe (PIECE)
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	/*
	 * BLOCK: NÃO QUEREMOS QUE A COR DE UMA PEÇA SEJA ALTERADA.
	public void setColor(Color color) {
		this.color = color;
	}
	*/

	
}
