package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}

	public boolean[][] possibleMoves(){
		//a fazer
	}
	
	public boolean possibleMove(Position position) {
		//a fazer
	}
	
	public boolean isThereAnyPossibleMove() {
		//a fazer
	}

}
