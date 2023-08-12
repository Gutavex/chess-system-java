package boardgame;

public class Piece {
	
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
	
	
	
}
