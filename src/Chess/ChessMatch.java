package Chess;

import boardgame.Board;

public class ChessMatch {
	
	// DECLARAR UM BOARD
	private Board board;
	
	//CONSTRUTOR PADRÃO
	//QUEM PRECISA SABER A DIMENSÃO DO TABULEIRA É A CLASSE CHESSMATCH
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//O TABULEIRO (BOARD) TEM AS PEÇAS
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		//downcasting para o board
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); //AQUI: acontece o downcasting para ChessPiece para interpretar como peça de chadrez
			}
		}
		
		return mat;
		
	}

}
