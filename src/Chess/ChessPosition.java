package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		//super();
		//DEFENSIVE PROGRAMMING
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	
	/*
	public void setColumn(char column) {
		this.column = column;
	}
	*/
	
	public int getRow() {
		return row;
	}
	
	/*
	public void setRow(int row) {
		this.row = row;
	}
	*/

	// LINHA DA MATRIX = 8 - CHESS_ROW (UNICODE VALUE OF ROW POSITION)
	// COLUNA DA MATRIX = CHESS_COLUMN - 'a' (UNICODE VALUE OF 'a')
	
	protected Position toPosition() {
		return new Position (8 - row, column - 'a');
	}
	
	//NO CHADREZ PRIMEIRO EU FALO A LINHA E DPOIS A COLUNA
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()) , 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row; // Forçar o compilador a entender que se trata de uma concatenação.
	}
}
