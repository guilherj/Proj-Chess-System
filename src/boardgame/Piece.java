package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
		/*
		 * POR PADR�O O JAVA J� COLOCA O ATRIBUTO POSITION COM VALOR NULL SEM NEM
		 * PRECISAR ATRIBUIR NO CONSTRUTOR, S� DECLAREI PARA FICAR FACIL DE LEMBRAR
		 */
	}

	protected Board getBoard() {
		return board;
	}
	
	

}
