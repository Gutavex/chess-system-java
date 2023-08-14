package chess;

import boardgame.Board;
import boardgame.Position;
import chess.piece.King;
import chess.piece.Rook;

public class ChessMatch {
	
	// DECLARAR UM BOARD
	private Board board;
	
	//CONSTRUTOR PADRÃO
	//QUEM PRECISA SABER A DIMENSÃO DO TABULEIRA É A CLASSE CHESSMATCH
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
	
	/// RESPONSÁVEL POR INICIAR A PARTIDA E COLOCAR AS PEÇAS NO TABULEIRO
	/// PARA INICIAR PRECISO CHAMAR ESSE MÉTODO NO CONSTRUTOR DA CLASSE
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(0, 3));
	}

}
