package chess;

import boardgame.Board;
import boardgame.Piece;
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
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		
		validateSourcePosition(source);	//RESPONSÁVEL POR VALIDAR A POSIÇÃO DE ORIGEM (CASO CONTRÁRIOA LANÇA UMA EXCEÇÃO)
		Piece capturedPiece = makeMove(source, target); //RESPONSÁVEL POR REALIZAR O MOVIMENTO DA PEÇA
		return (ChessPiece) capturedPiece;
	}
	
	
	
	private Piece makeMove(Position source, Position target) {
		// TODO Auto-generated method stub
		Piece p = board.removePiece(source); // REMOVE A PEÇA DA POSIÇÃO DE ORIGEM
		Piece capturedPiece = board.removePiece(target); // REMOVE A PEÇA DA POSIÇÃO DE ORIGEM (PEÇA CAPTURADA)
		board.placePiece(p, target); // COLOCA A PEÇA NA POSIÇÃO DE DESTINO
		return capturedPiece; //RETORNA A PEÇA CAPTURADA
	}

	private void validateSourcePosition(Position position) {
		// TODO Auto-generated method stub
		if (!board.thereIsAPiece(position)) {
			throw new ChessException("There is no piece on source position.");
		}
		if (!board.piece(position).isThereAnyPossibleMove()) {
			throw new ChessException("There is no possible moves for the chosen piece.");
		}
	}

	//RECEBE AS COORDENADAS DO CHADREZ
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	/// RESPONSÁVEL POR INICIAR A PARTIDA E COLOCAR AS PEÇAS NO TABULEIRO
	/// PARA INICIAR PRECISO CHAMAR ESSE MÉTODO NO CONSTRUTOR DA CLASSE
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}

}
