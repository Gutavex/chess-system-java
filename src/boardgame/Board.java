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

	
}
