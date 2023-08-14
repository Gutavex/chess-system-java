package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces; // MATRIZ DE PEÇAS DO TABULEIRO
	
	public Board(int rows, int columns) {
		//super();
		this.rows = rows;
		this.columns = columns;
		
		// MANUALLY: Informando que as peças serão iniciadas com a quantidade de "rows" e "columns" informadas.
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//SOBRECARGA: RETORNA A PEÇA PELA POSIÇÃO 
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//MATRIZ DE PIECES DECLARADA NA CLASSE
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
}
