package boardgame;

public abstract class Piece {
	
	// PROPRIEDAD PROTEGIDA "#" ela não é visível a outras camadas
	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		//super();
		this.board = board;
		position = null; // por padrão o JAVA já coloca como nulo
	}

	//SOMENTE CLASSES DO MESMO PACOTE OU SUBCLASSE PODERÃO ACESSAR A PROPRIEDADE DA CLASSE (PROTEGIDO)
	protected Board getBoard() {
		return board;
	}

	//NÃO SERÁ PERMITIDO QUE O TABULEIRO SEJA ALTERADO
	//ENTÃO REMOVEREMOS ESSE SET
	/*
	public void setBoard(Board board) {
		this.board = board;
	} 
	*/
	
	// TEREI QUE DEFINIR A CLASSE COMO ABSTRATA TAMBEM
	public abstract boolean[][]possibleMoves(); //
	
	//HOOK METHOD CONCEPT: Método concreto que faz uma implementação de subclasse.
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
